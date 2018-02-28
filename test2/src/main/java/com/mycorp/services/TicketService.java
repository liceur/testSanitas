package com.mycorp.services;

import util.datos.UsuarioAlta;

public interface TicketService {

    String altaTicketZendesk(UsuarioAlta usuarioAlta, String userAgent);
}
