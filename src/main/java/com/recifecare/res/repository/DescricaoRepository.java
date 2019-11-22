package com.recifecare.res.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.recifecare.res.model.Descricao;

@Repository
public interface DescricaoRepository extends MongoRepository<Descricao, String> {

}
