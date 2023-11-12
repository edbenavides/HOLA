package com.tutorial.seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.tutorial.seguridad.Modelos.Rol;

public interface RepositorioRol extends MongoRepository<Rol,String> {
}