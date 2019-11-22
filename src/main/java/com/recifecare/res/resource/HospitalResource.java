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

import com.recifecare.res.model.Hospital;
import com.recifecare.res.service.HospitalService;

@RestController
@RequestMapping(value = "/hospitals")
public class HospitalResource {

	@Autowired
	private HospitalService service;
	
	@GetMapping
	public ResponseEntity <List<Hospital>> findAll(){
		return ResponseEntity.ok().body(service.findAll());
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Hospital>findById(@PathVariable String id){
		Hospital obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody Hospital hosp){
		Hospital hospIns = service.insert(hosp);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/[id]")
	public ResponseEntity<Void> update(@RequestBody Hospital newObj , @PathVariable String id){
		Hospital obj = service.insert(newObj);
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
}
