package com.recifecare.res.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Descricao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String especialidade;
	private String como_usar;
	private String horario;
	private String ordem;
	private String latitude;
	private String longitude;
	
	public Descricao() {
	}

	public Descricao(String id, String especialidade, String como_usar, String horario, String ordem, String latitude,
			String longitude) {
		this.id = id;
		this.especialidade = especialidade;
		this.como_usar = como_usar;
		this.horario = horario;
		this.ordem = ordem;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getComo_usar() {
		return como_usar;
	}

	public void setComo_usar(String como_usar) {
		this.como_usar = como_usar;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
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
		Descricao other = (Descricao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
