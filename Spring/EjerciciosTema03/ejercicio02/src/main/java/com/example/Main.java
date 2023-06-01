package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Obtener el contexto de la aplicación desde el archivo beans.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Obtener el bean "userService" del contexto
        UserService service = (UserService) context.getBean("userService");

        // Ejecutar metodo imprimirSaludo() de NotificationService
        service.notificationService.imprimirSaludo();
    }
}
