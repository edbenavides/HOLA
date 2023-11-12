package com.tutorial.seguridad.Repositorios;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.tutorial.seguridad.Modelos.Permiso;


public interface RepositorioPermiso extends  MongoRepository<Permiso,String>{
}
