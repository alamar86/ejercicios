package com.joseAlamar.ejercicio01Sesiones4_5_6;

import com.joseAlamar.ejercicio01Sesiones4_5_6.entities.Laptop;
import com.joseAlamar.ejercicio01Sesiones4_5_6.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio01Sesiones456Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Ejercicio01Sesiones456Application.class, args);
		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "Apple", "Macbook Pro", 2199);
		Laptop laptop2 = new Laptop(null, "HP", "Envy X360", 1189.15);

		laptopRepository.save(laptop1);
		laptopRepository.save(laptop2);
	}

}
