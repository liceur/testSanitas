package com.mycorp.handlers.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycorp.ZendeskException;
import com.mycorp.handlers.BasicAsyncCompletionHandler;
import com.mycorp.handlers.ZendeskAsyncCompletionHandler;
import com.mycorp.mappers.MyObjectMapper;
import com.ning.http.client.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class BasicAsyncCompletionHandlerImpl<T> extends ZendeskAsyncCompletionHandler<T> implements BasicAsyncCompletionHandler {

    private final Logger logger = LoggerFactory.getLogger(BasicAsyncCompletionHandlerImpl.class);

    private Class<T> clazz;
    private String name;
    private Class[] typeParams;
    private ObjectMapper mapper = MyObjectMapper.createMapper();

    public BasicAsyncCompletionHandlerImpl() {
    }

    public BasicAsyncCompletionHandlerImpl(Class clazz, String name, Class... typeParams) {
        this.clazz = clazz;
        this.name = name;
        this.typeParams = typeParams;
    }

    @Override
    public <T> ZendeskAsyncCompletionHandler<T> handle(final Class<T> clazz, final String name, final Class... typeParams) {
        return new BasicAsyncCompletionHandlerImpl<T>(clazz, name, typeParams);
    }

    @Override
    public T onCompleted(Response response) throws Exception {
        logResponse(response);
        if (isStatus2xx(response)) {
            if (typeParams.length > 0) {
                JavaType type = mapper.getTypeFactory().constructParametricType(clazz, typeParams);
                return mapper.convertValue(mapper.readTree(response.getResponseBodyAsStream()).get(name), type);
            }
            return mapper.convertValue(mapper.readTree(response.getResponseBodyAsStream()).get(name), clazz);
        } else if (isRateLimitResponse(response)) {
            throw new ZendeskException(response.toString());
        }
        if (response.getStatusCode() == 404) {
            return null;
        }
        throw new ZendeskException(response.toString());
    }

    private boolean isStatus2xx(Response response) {
        return response.getStatusCode() / 100 == 2;
    }

    private void logResponse(Response response) throws IOException {
        if (logger.isDebugEnabled()) {
            logger.debug("Response HTTP/{} {}\n{}", response.getStatusCode(), response.getStatusText(),
                    response.getResponseBody());
        }
        if (logger.isTraceEnabled()) {
            logger.trace("Response headers {}", response.getHeaders());
        }
    }

    private boolean isRateLimitResponse(Response response) {
        return response.getStatusCode() == 429;
    }
}
