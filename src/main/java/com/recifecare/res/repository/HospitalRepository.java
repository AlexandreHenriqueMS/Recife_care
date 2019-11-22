package com.recifecare.res.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.recifecare.res.model.Hospital;

@Repository
public interface HospitalRepository extends MongoRepository<Hospital, String>{

}
