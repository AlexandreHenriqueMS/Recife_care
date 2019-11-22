package com.recifecare.res.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recifecare.res.model.Hospital;
import com.recifecare.res.repository.HospitalRepository;
import com.recifecare.res.service.exception.ObjectNotFound;

@Service
public class HospitalService {

	@Autowired
	private HospitalRepository repo;
	
	public List<Hospital> findAll() {
		return repo.findAll();
	}
	
	public Hospital findById(String id) {
		Optional<Hospital> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFound("Objeto não encontrado"));
	}
	
	public Hospital insert(Hospital hosp) {
		return repo.insert(hosp);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public Hospital update(Hospital obj) {
		Hospital newObj = findById(obj.getId());
		updatedata(newObj, obj);
		return repo.save(newObj);
	}

	private void updatedata(Hospital newObj, Hospital obj) {
		newObj.setCnes(obj.getCnes());
		newObj.setCod_nat(obj.getCod_nat());
		newObj.setDistrito_sanitario(obj.getDistrito_sanitario());
		newObj.setMicrorregião(obj.getMicrorregião());
		newObj.setNome_official(obj.getNome_official());
		newObj.setRpa(obj.getRpa());
		newObj.setTipo_servico(obj.getTipo_servico());
		newObj.setServico(obj.getServico());
	}
	
}
