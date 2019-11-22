package com.recifecare.res.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.recifecare.res.model.Descricao;
import com.recifecare.res.model.Endereco;
import com.recifecare.res.model.Hospital;
import com.recifecare.res.repository.DescricaoRepository;
import com.recifecare.res.repository.EnderecoRepository;
import com.recifecare.res.repository.HospitalRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private HospitalRepository repoH;
	
	@Autowired
	private EnderecoRepository repoEn;
	
	@Autowired
	private DescricaoRepository repoD;

	@Override
	public void run(String... args) throws Exception {
		List<Hospital> objH = repoH.findAll();
		List<Endereco> objE = repoEn.findAll();
		List<Descricao> objD = repoD.findAll();
		Hospital obj = null;
		
		for(int cc=0;cc<objH.size()-1;cc++) {
			if(objE.get(cc)==null) {
				obj.setEndereco(null);
			} else {
				obj = objH.get(cc);
				obj.setEndereco(objE.get(cc));
			}
		}
		
		for(int cc=0;cc<objH.size()-1;cc++) {
			if(objD.get(cc)==null) {
				obj.setEndereco(null);
			} else {
				obj = objH.get(cc);
				obj.setDescricao(objD.get(cc));
			}
		}
	}

}
