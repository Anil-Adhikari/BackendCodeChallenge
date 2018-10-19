package com.anil.codechallenge.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;



@Entity
@Table(name = "valuees")
public class Values {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "value_id")
	@JsonIgnore
	private Integer valueId;
	
	private String value;
	
	public Values() {

	}

	public Values(String value) {
		super();
		this.value = value;
	}
	
	@JsonValue
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getValueId() {
		return valueId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		result = prime * result + ((valueId == null) ? 0 : valueId.hashCode());
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
		Values other = (Values) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		if (valueId == null) {
			if (other.valueId != null)
				return false;
		} else if (!valueId.equals(other.valueId))
			return false;
		return true;
	}
	
}
