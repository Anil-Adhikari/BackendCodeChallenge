package com.anil.codechallenge.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "application_part_detail")
public class ApplicationPartDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="application_part_id")
	@JsonIgnore
	private Integer applicationPartId;
	
	@JsonProperty("FilePN")
	private String filePN;
	
	@JsonProperty("FrozenStatus")
	private String forzenStatus;
	
	@JsonProperty("SuccessorPartNumber")
	private String successorPartNumber;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JsonProperty("MGMFile")
	private MGMFile mgmFile;
	
	@JsonProperty("Version")
	private String version;
	
	@JsonProperty("RuntimeSize")
	private String runtimeSize;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private ApplicationDetail applicationDetail;
	
	public ApplicationPartDetail() {

	}

	public ApplicationPartDetail(String filePN, String forzenStatus, String successorPartNumber, MGMFile mgmFile,
			String version, String runtimeSize) {
		super();
		this.filePN = filePN;
		this.forzenStatus = forzenStatus;
		this.successorPartNumber = successorPartNumber;
		this.mgmFile = mgmFile;
		this.version = version;
		this.runtimeSize = runtimeSize;
	}

	public String getFilePN() {
		return filePN;
	}

	public void setFilePN(String filePN) {
		this.filePN = filePN;
	}

	public String getForzenStatus() {
		return forzenStatus;
	}

	public void setForzenStatus(String forzenStatus) {
		this.forzenStatus = forzenStatus;
	}

	public String getSuccessorPartNumber() {
		return successorPartNumber;
	}

	public void setSuccessorPartNumber(String successorPartNumber) {
		this.successorPartNumber = successorPartNumber;
	}

	public MGMFile getMgmFile() {
		return mgmFile;
	}

	public void setMgmFile(MGMFile mgmFile) {
		this.mgmFile = mgmFile;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getRuntimeSize() {
		return runtimeSize;
	}

	public void setRuntimeSize(String runtimeSize) {
		this.runtimeSize = runtimeSize;
	}

	public Integer getApplicationPartId() {
		return applicationPartId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicationDetail == null) ? 0 : applicationDetail.hashCode());
		result = prime * result + ((applicationPartId == null) ? 0 : applicationPartId.hashCode());
		result = prime * result + ((filePN == null) ? 0 : filePN.hashCode());
		result = prime * result + ((forzenStatus == null) ? 0 : forzenStatus.hashCode());
		result = prime * result + ((mgmFile == null) ? 0 : mgmFile.hashCode());
		result = prime * result + ((runtimeSize == null) ? 0 : runtimeSize.hashCode());
		result = prime * result + ((successorPartNumber == null) ? 0 : successorPartNumber.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
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
		ApplicationPartDetail other = (ApplicationPartDetail) obj;
		if (applicationDetail == null) {
			if (other.applicationDetail != null)
				return false;
		} else if (!applicationDetail.equals(other.applicationDetail))
			return false;
		if (applicationPartId == null) {
			if (other.applicationPartId != null)
				return false;
		} else if (!applicationPartId.equals(other.applicationPartId))
			return false;
		if (filePN == null) {
			if (other.filePN != null)
				return false;
		} else if (!filePN.equals(other.filePN))
			return false;
		if (forzenStatus == null) {
			if (other.forzenStatus != null)
				return false;
		} else if (!forzenStatus.equals(other.forzenStatus))
			return false;
		if (mgmFile == null) {
			if (other.mgmFile != null)
				return false;
		} else if (!mgmFile.equals(other.mgmFile))
			return false;
		if (runtimeSize == null) {
			if (other.runtimeSize != null)
				return false;
		} else if (!runtimeSize.equals(other.runtimeSize))
			return false;
		if (successorPartNumber == null) {
			if (other.successorPartNumber != null)
				return false;
		} else if (!successorPartNumber.equals(other.successorPartNumber))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}
	
	
}
