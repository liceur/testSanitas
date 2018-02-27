package com.mycorp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {

    public static void main(String[] args) {

        // loading the definitions from the given XML file
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");


    }

}
