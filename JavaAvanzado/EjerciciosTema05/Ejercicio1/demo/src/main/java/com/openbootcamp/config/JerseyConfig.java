package com.openbootcamp.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@ApplicationPath("/")
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        // Especificamos donde tenemos los controladores
        this.packages("com.openbootcamp.controllers");
    }
}
