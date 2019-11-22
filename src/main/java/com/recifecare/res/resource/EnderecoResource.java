package com.recifecare.res.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recifecare.res.model.Endereco;
import com.recifecare.res.model.Hospital;
import com.recifecare.res.repository.EnderecoRepository;
import com.recifecare.res.service.EnderecoService;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoResource {

	@Autowired
	private EnderecoService service;
	
	@GetMapping
	public ResponseEntity<List<Endereco>> findAll(){
		return ResponseEntity.ok().body(service.findAll());
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Endereco> findById(@PathVariable String id){
		Endereco obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody Endereco end){
		Endereco endIns = service.insert(end);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/[id]")
	public ResponseEntity<Void> update(@RequestBody Endereco newObj , @PathVariable String id){
		Endereco obj = service.insert(newObj);
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
}
