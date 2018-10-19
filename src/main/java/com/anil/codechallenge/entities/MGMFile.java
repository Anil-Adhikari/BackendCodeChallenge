package com.anil.codechallenge.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "mgmfile")
public class MGMFile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mgmfile_id")
	@JsonIgnore
	private Integer mgmFileId;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JsonProperty("Protocol")
	private List<Protocol> protocol;
	
	@JsonProperty("FileFormat")
	private String fileFormat;
	
	@JsonProperty("CheckSum")
	private String checkSum;
	
	@JsonProperty("FileFingerPrint")
	private String fileFingerPrint;
	
	@JsonProperty("ROMSizeKB")
	private String romSizeKb;
	
	@JsonProperty("Size")
	private String size;
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "MMM-dd-yyyy hh:mm:ss")
	@JsonProperty("FileDateModified")
	private Date fileDateModified;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private ApplicationPartDetail applicationPartDetail;
	
	public MGMFile() {

	}

	public MGMFile(List<Protocol> protocol, String fileFormat, String checkSum, String fileFingerPrint,
			String romSizeKb, String size, Date fileDateModified) {
		super();
		this.protocol = protocol;
		this.fileFormat = fileFormat;
		this.checkSum = checkSum;
		this.fileFingerPrint = fileFingerPrint;
		this.romSizeKb = romSizeKb;
		this.size = size;
		this.fileDateModified = fileDateModified;
	}

	public List<Protocol> getProtocol() {
		return protocol;
	}

	public void setProtocol(List<Protocol> protocol) {
		this.protocol = protocol;
	}

	public String fileFormat() {
		return fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public String getCheckSum() {
		return checkSum;
	}

	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}

	public String getFileFingerPrint() {
		return fileFingerPrint;
	}

	public void setFileFingerPrint(String fileFingerPrint) {
		this.fileFingerPrint = fileFingerPrint;
	}

	public String getRomSizeKb() {
		return romSizeKb;
	}

	public void setRomSizeKb(String romSizeKb) {
		this.romSizeKb = romSizeKb;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Date getFileDateModified() {
		return fileDateModified;
	}

	public void setFileDateModified(Date fileDateModified) {
		this.fileDateModified = fileDateModified;
	}

	public Integer getMgmFileId() {
		return mgmFileId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicationPartDetail == null) ? 0 : applicationPartDetail.hashCode());
		result = prime * result + ((checkSum == null) ? 0 : checkSum.hashCode());
		result = prime * result + ((fileDateModified == null) ? 0 : fileDateModified.hashCode());
		result = prime * result + ((fileFingerPrint == null) ? 0 : fileFingerPrint.hashCode());
		result = prime * result + ((fileFormat == null) ? 0 : fileFormat.hashCode());
		result = prime * result + ((mgmFileId == null) ? 0 : mgmFileId.hashCode());
		result = prime * result + ((protocol == null) ? 0 : protocol.hashCode());
		result = prime * result + ((romSizeKb == null) ? 0 : romSizeKb.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
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
		MGMFile other = (MGMFile) obj;
		if (applicationPartDetail == null) {
			if (other.applicationPartDetail != null)
				return false;
		} else if (!applicationPartDetail.equals(other.applicationPartDetail))
			return false;
		if (checkSum == null) {
			if (other.checkSum != null)
				return false;
		} else if (!checkSum.equals(other.checkSum))
			return false;
		if (fileDateModified == null) {
			if (other.fileDateModified != null)
				return false;
		} else if (!fileDateModified.equals(other.fileDateModified))
			return false;
		if (fileFingerPrint == null) {
			if (other.fileFingerPrint != null)
				return false;
		} else if (!fileFingerPrint.equals(other.fileFingerPrint))
			return false;
		if (fileFormat == null) {
			if (other.fileFormat != null)
				return false;
		} else if (!fileFormat.equals(other.fileFormat))
			return false;
		if (mgmFileId == null) {
			if (other.mgmFileId != null)
				return false;
		} else if (!mgmFileId.equals(other.mgmFileId))
			return false;
		if (protocol == null) {
			if (other.protocol != null)
				return false;
		} else if (!protocol.equals(other.protocol))
			return false;
		if (romSizeKb == null) {
			if (other.romSizeKb != null)
				return false;
		} else if (!romSizeKb.equals(other.romSizeKb))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		return true;
	}
	
	
	
}
