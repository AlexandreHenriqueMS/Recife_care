package com.recifecare.res.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.recifecare.res.model.Endereco;

@Repository
public interface EnderecoRepository extends MongoRepository<Endereco, String>{

}
