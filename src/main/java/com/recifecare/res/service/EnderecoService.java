package com.recifecare.res.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recifecare.res.model.Endereco;
import com.recifecare.res.model.Hospital;
import com.recifecare.res.repository.EnderecoRepository;
import com.recifecare.res.repository.HospitalRepository;
import com.recifecare.res.service.exception.ObjectNotFound;

@Service
public class EnderecoService {

	
	@Autowired
	private EnderecoRepository repo;
	
	public List<Endereco> findAll() {
		return repo.findAll();
	}
	
	public Endereco findById(String id) {
		Optional<Endereco> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFound("Objeto não encontrado"));
	}
	
	public Endereco insert(Endereco end) {
		return repo.insert(end);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public Endereco update(Endereco obj) {
		Endereco newObj = findById(obj.getId());
		updatedata(newObj, obj);
		return repo.save(newObj);
	}

	private void updatedata(Endereco newObj, Endereco obj) {
		newObj.setBairro(obj.getBairro());
		newObj.setEndereco(obj.getEndereco());
		newObj.setFone(obj.getFone());
	}
}
