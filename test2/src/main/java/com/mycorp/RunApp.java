package com.mycorp;

import com.mycorp.services.impl.ZendeskService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import util.datos.UsuarioAlta;

public class RunApp {

    public static void main(String[] args) {

        // loading the definitions from the given XML file
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        ZendeskService zendeskService = (ZendeskService) context.getBean("zendeskService");

        UsuarioAlta usuarioAlta = new UsuarioAlta();
        usuarioAlta.setNombre("Adrian");
        usuarioAlta.setApellido1("Nicolas");
        usuarioAlta.setNumPoliza("12345");
        usuarioAlta.setNumTarjeta("123456");
        usuarioAlta.setEmail("email@gmail.com");
        usuarioAlta.setNumeroTelefono("600123456");
        usuarioAlta.setNumDocAcreditativo("9876");

        String datosUsuario = zendeskService.altaTicketZendesk( usuarioAlta, "agent1");

        System.out.println();
        System.out.println("Start Alta Usuario...");
        System.out.println("Datos de usuario: " + datosUsuario);
    }

}
