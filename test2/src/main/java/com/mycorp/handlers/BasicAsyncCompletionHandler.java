package com.mycorp.handlers;

public interface BasicAsyncCompletionHandler {

    public <T> ZendeskAsyncCompletionHandler<T> handle(final Class<T> clazz, final String name, final Class... typeParams);
}
