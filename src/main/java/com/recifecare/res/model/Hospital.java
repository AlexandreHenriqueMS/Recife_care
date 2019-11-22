package com.recifecare.res.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Hospital implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String nome_official; 
	private String rpa; 
	private String distrito_sanitario; 
	private String microregião; 
	private String cnes; 
	private String cod_nat;
	private String tipo_servico;
	private String servico;
	private Endereco endereco;
	private Descricao descricao;
	
	public Hospital() {
	}
	
	public Hospital(String id, String nome_official, String rpa, String distrito_sanitario, String microregião,
			String cnes, String cod_nat, String tipo_servico, String servico, Endereco endereco, Descricao descricao) {
		super();
		this.id = id;
		this.nome_official = nome_official;
		this.rpa = rpa;
		this.distrito_sanitario = distrito_sanitario;
		this.microregião = microregião;
		this.cnes = cnes;
		this.cod_nat = cod_nat;
		this.tipo_servico = tipo_servico;
		this.servico = servico;
		this.endereco = endereco;
		this.descricao = descricao;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome_official() {
		return nome_official;
	}

	public void setNome_official(String nome_official) {
		this.nome_official = nome_official;
	}

	public String getRpa() {
		return rpa;
	}

	public void setRpa(String rpa) {
		this.rpa = rpa;
	}

	public String getDistrito_sanitario() {
		return distrito_sanitario;
	}

	public void setDistrito_sanitario(String distrito_sanitario) {
		this.distrito_sanitario = distrito_sanitario;
	}

	public String getMicrorregião() {
		return microregião;
	}

	public void setMicrorregião(String microrregião) {
		this.microregião = microrregião;
	}

	public String getCnes() {
		return cnes;
	}

	public void setCnes(String cnes) {
		this.cnes = cnes;
	}

	public String getCod_nat() {
		return cod_nat;
	}

	public void setCod_nat(String cod_nat) {
		this.cod_nat = cod_nat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hospital other = (Hospital) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



	public String getTipo_servico() {
		return tipo_servico;
	}



	public void setTipo_servico(String tipo_servico) {
		this.tipo_servico = tipo_servico;
	}



	public String getServico() {
		return servico;
	}



	public void setServico(String servico) {
		this.servico = servico;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Descricao getDescricao() {
		return descricao;
	}

	public void setDescricao(Descricao descricao) {
		this.descricao = descricao;
	}
	
	
}
