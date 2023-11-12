package com.tutorial.seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import  com.tutorial.seguridad.Modelos.Usuario;

public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
}










