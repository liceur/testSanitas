package com.mycorp.services.impl;


import com.mycorp.services.TicketService;
import com.mycorp.support.MensajeriaService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import portalclientesweb.ejb.interfaces.PortalClientesWebEJBRemote;
import util.datos.UsuarioAlta;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = ("classpath:applicationContextTest.xml"))
public class ZendeskServiceTest {

    private TicketService ticketService;

    private PortalClientesWebEJBRemote portalclientesWebEJBRemote = mock(PortalClientesWebEJBRemote.class);


    private MensajeriaService emailService = mock(MensajeriaService.class);


    @Before
    public void init() {

        ticketService = new ZendeskService(portalclientesWebEJBRemote, emailService);

        org.springframework.test.util.ReflectionTestUtils.setField(
                ticketService, "ZENDESK_ERROR_MAIL_FUNCIONALIDAD", "1");

    }

    @Test
    public void givenUsuarioAltaWhenAltaTicketThenGetInfoForUser() {

        // given
        UsuarioAlta usuarioAlta = new UsuarioAlta();

        // when
        String res = ticketService.altaTicketZendesk(usuarioAlta, "agent123");

        // then
        assertThat(res, is(notNullValue()));

    }

}
