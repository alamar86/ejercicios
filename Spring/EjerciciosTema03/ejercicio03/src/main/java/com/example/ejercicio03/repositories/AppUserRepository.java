package com.example.ejercicio03.repositories;

import com.example.ejercicio03.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
