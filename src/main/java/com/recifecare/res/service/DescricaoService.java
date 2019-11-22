package com.recifecare.res.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recifecare.res.model.Descricao;
import com.recifecare.res.repository.DescricaoRepository;
import com.recifecare.res.service.exception.ObjectNotFound;

@Service
public class DescricaoService {

	
	@Autowired
	private DescricaoRepository repo;
	
	public List<Descricao> findAll() {
		return repo.findAll();
	}
	
	public Descricao findById(String id) {
		Optional<Descricao> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFound("Objeto não encontrado"));
	}
	
	public Descricao insert(Descricao end) {
		return repo.insert(end);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public Descricao update(Descricao obj) {
		Descricao newObj = findById(obj.getId());
		updatedata(newObj, obj);
		return repo.save(newObj);
	}

	private void updatedata(Descricao newObj, Descricao obj) {
		newObj.setComo_usar(obj.getComo_usar());
		newObj.setEspecialidade(obj.getEspecialidade());
		newObj.setHorario(obj.getHorario());
		newObj.setLatitude(obj.getLatitude());
		newObj.setLongitude(obj.getLongitude());
		newObj.setOrdem(obj.getOrdem());
	}
}
