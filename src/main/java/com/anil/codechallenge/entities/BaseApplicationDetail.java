package com.anil.codechallenge.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseApplicationDetail {
	
	@JsonProperty("ApplicationDetail")
	private List<ApplicationDetail> applicationDetailsList;
	
	public BaseApplicationDetail() {
		
	}

	public BaseApplicationDetail(List<ApplicationDetail> applicationDetailsList) {
		super();
		this.applicationDetailsList = applicationDetailsList;
	}

	public List<ApplicationDetail> getApplicationDetailsList() {
		return applicationDetailsList;
	}

	public void setApplicationDetailsList(List<ApplicationDetail> applicationDetailsList) {
		this.applicationDetailsList = applicationDetailsList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicationDetailsList == null) ? 0 : applicationDetailsList.hashCode());
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
		BaseApplicationDetail other = (BaseApplicationDetail) obj;
		if (applicationDetailsList == null) {
			if (other.applicationDetailsList != null)
				return false;
		} else if (!applicationDetailsList.equals(other.applicationDetailsList))
			return false;
		return true;
	}
	
	
}
