package com.example.ejercicio03;

import com.example.ejercicio03.entities.AppUser;
import com.example.ejercicio03.repositories.AppUserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Ejercicio03Application {

	private final AppUserRepository userRepository;

	public Ejercicio03Application(AppUserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Ejercicio03Application.class, args);

		Ejercicio03Application ejercicio03Application = context.getBean(Ejercicio03Application.class);
		ejercicio03Application.runDemo();
	}

	public void runDemo() {
		// Crear un nuevo usuario
		AppUser user = new AppUser();
		user.setUsername("John Doe");
		user.setAge(30);
		user.setEmail("John.Doe@gmail.com");

		// Guardar el usuario en la base de datos
		userRepository.save(user);

		// Obtener todos los usuarios de la base de datos
		Iterable<AppUser> users = userRepository.findAll();
		for (AppUser u : users) {
			System.out.println("idUser: " + u.getId()+ " "
					+ u.getUsername() +
					" - " + u.getAge() +
					" - " + u.getEmail());
		}
	}
}
