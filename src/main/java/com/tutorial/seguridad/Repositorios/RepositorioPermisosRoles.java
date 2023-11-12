package com.tutorial.seguridad.Repositorios;
import org.springframework.data.mongodb.repository.MongoRepository;
import  com.tutorial.seguridad.Modelos.PermisosRoles;


public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String> {
}
