package com.anil.codechallenge.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "assypn")
public class AssyPN {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "compatible_assemblies_id")
	@JsonIgnore
	private Integer assyPnId;
	
	@JsonProperty("AssyPN")
	private String value;
	
	public AssyPN() {
		
	}

	public AssyPN(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getAssyPnId() {
		return assyPnId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assyPnId == null) ? 0 : assyPnId.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		AssyPN other = (AssyPN) obj;
		if (assyPnId == null) {
			if (other.assyPnId != null)
				return false;
		} else if (!assyPnId.equals(other.assyPnId))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
	
	
}
