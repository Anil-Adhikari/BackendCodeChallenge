package com.anil.codechallenge.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "functional_type")
public class FunctionalType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "functional_type_id")
	@JsonIgnore
	private Integer functionalTypeId;
	
	@JsonProperty("FunctionalType")
	private String functionalType;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private ApplicationDetail applicationDetail;
	
	public FunctionalType() {

	}

	public FunctionalType(String functionalType) {
		super();
		this.functionalType = functionalType;
	}

	public String getFunctionalType() {
		return functionalType;
	}

	public void setFunctionalType(String functionalType) {
		this.functionalType = functionalType;
	}

	public Integer getFunctionalTypeId() {
		return functionalTypeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicationDetail == null) ? 0 : applicationDetail.hashCode());
		result = prime * result + ((functionalType == null) ? 0 : functionalType.hashCode());
		result = prime * result + ((functionalTypeId == null) ? 0 : functionalTypeId.hashCode());
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
		FunctionalType other = (FunctionalType) obj;
		if (applicationDetail == null) {
			if (other.applicationDetail != null)
				return false;
		} else if (!applicationDetail.equals(other.applicationDetail))
			return false;
		if (functionalType == null) {
			if (other.functionalType != null)
				return false;
		} else if (!functionalType.equals(other.functionalType))
			return false;
		if (functionalTypeId == null) {
			if (other.functionalTypeId != null)
				return false;
		} else if (!functionalTypeId.equals(other.functionalTypeId))
			return false;
		return true;
	}
	
	
}
