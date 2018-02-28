package com.mycorp.services.impl;

import com.mycorp.support.CorreoElectronico;
import com.mycorp.support.MensajeriaService;
import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MensajeriaService {

    public EmailService() {
    }

    @Override
    public void enviar(CorreoElectronico correo) {
        // TODO
    }
}
