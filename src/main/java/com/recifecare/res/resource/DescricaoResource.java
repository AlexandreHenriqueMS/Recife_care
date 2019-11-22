package com.recifecare.res.resource;

import java.util.List;

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

import com.recifecare.res.model.Descricao;
import com.recifecare.res.service.DescricaoService;

@RestController
@RequestMapping(value = "/descricao")
public class DescricaoResource {

	@Autowired
	private DescricaoService service;
	
	@GetMapping
	public ResponseEntity<List<Descricao>> findAll(){
		return ResponseEntity.ok().body(service.findAll());
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Descricao> findById(@PathVariable String id){
		Descricao obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody Descricao end){
		Descricao endIns = service.insert(end);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/[id]")
	public ResponseEntity<Void> update(@RequestBody Descricao newObj , @PathVariable String id){
		Descricao obj = service.insert(newObj);
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
}
