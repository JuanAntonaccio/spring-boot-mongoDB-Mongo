package com.api.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.api.mongo.documentos.Usuarios;

public interface UsuarioRepository extends MongoRepository<Usuarios, Integer> {
	

}
