package com.anil.codechallenge.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@NamedQueries({
	@NamedQuery(name="ApplicationDetail.selectAll",
			query="select a from ApplicationDetail a")})
@Table(name = "application_detail")
public class ApplicationDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "application_detail_id")	
	@JsonIgnore
	private Integer applicationDetailId;
	
	@JsonProperty("SubType")
	private String subtype;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	@JsonProperty("Values")
	private List<Values> values;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JsonProperty("ApplicationPartDetail")
	private ApplicationPartDetail applicationPartDetail;
	
	@Column(name = "application_description")
	@JsonProperty("ApplicationDescription")
	private String applicationDescription;
	
	@JsonProperty("Serviceable")
	private String serviceable;
	
	@JsonProperty("Testable")
	private String testable;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	@JsonProperty("CompatibleAssemblies")
	private List<AssyPN> compatibleAssemblies;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JsonProperty("FunctionalTypeValues")
	private FunctionalType functionalTypeValues;
	
	@JsonProperty("Sellable")
	private String sellable;
	
	@JsonProperty("ResidentOnVehicle")
	private String residentOnVehicle;
	
	@JsonProperty("DigitallySigned")
	private String digitallySigned;
	
	@JsonProperty("ConsumerViewable")
	private String consumerViewable;
	
	@JsonProperty("ConsumerDownloadable")
	private String consumerDownloadble;
	
	@JsonProperty("DealerDownloadable")
	private String dealerDownloadable;
	
	@JsonProperty("OTAViewable")
	private String otaViewable;
	
	@JsonProperty("OTADownloadable")
	private String otaDownlable;
	
	public ApplicationDetail() {
		
	}

	public ApplicationDetail(String subtype, List<Values> values, ApplicationPartDetail applicationPartDetail,
			String applicationDescription, String serviceable, String testable,
			List<AssyPN> compatibleAssemblies, FunctionalType functionalType, String sellable,
			String residentOnVehicle, String digitallySigned, String consumerViewable, String consumerDownloadble,
			String otaViewable, String otaDownlable, String dealerDownloadable) {
		super();
		this.subtype = subtype;
		this.values = values;
		this.applicationPartDetail = applicationPartDetail;
		this.applicationDescription = applicationDescription;
		this.serviceable = serviceable;
		this.testable = testable;
		this.compatibleAssemblies = compatibleAssemblies;
		this.functionalTypeValues = functionalType;
		this.sellable = sellable;
		this.residentOnVehicle = residentOnVehicle;
		this.digitallySigned = digitallySigned;
		this.consumerViewable = consumerViewable;
		this.consumerDownloadble = consumerDownloadble;
		this.otaViewable = otaViewable;
		this.otaDownlable = otaDownlable;
		this.dealerDownloadable = dealerDownloadable;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public List<Values> getValues() {
		return values;
	}

	public void setValues(List<Values> values) {
		this.values = values;
	}

	public ApplicationPartDetail getApplicationPartDetail() {
		return applicationPartDetail;
	}

	public void setApplicationPartDetail(ApplicationPartDetail applicationPartDetail) {
		this.applicationPartDetail = applicationPartDetail;
	}

	public String getApplicationDescription() {
		return applicationDescription;
	}

	public void setApplicationDescription(String applicationDescription) {
		this.applicationDescription = applicationDescription;
	}

	public String getServiceable() {
		return serviceable;
	}

	public void setServiceable(String serviceable) {
		this.serviceable = serviceable;
	}

	public String getTestable() {
		return testable;
	}

	public void setTestable(String testable) {
		this.testable = testable;
	}

	public List<AssyPN> getCompatibleAssemblies() {
		return compatibleAssemblies;
	}

	public void setCompatibleAssemblies(List<AssyPN> compatibleAssemblies) {
		this.compatibleAssemblies = compatibleAssemblies;
	}

	public FunctionalType getFunctionalTypeValues() {
		return functionalTypeValues;
	}

	public void setFunctionalTypeValues(FunctionalType functionalType) {
		this.functionalTypeValues = functionalType;
	}

	public String getSellable() {
		return sellable;
	}

	public void setSellable(String sellable) {
		this.sellable = sellable;
	}

	public String getResidentOnVehicle() {
		return residentOnVehicle;
	}

	public void setResidentOnVehicle(String residentOnVehicle) {
		this.residentOnVehicle = residentOnVehicle;
	}

	public String getDigitallySigned() {
		return digitallySigned;
	}

	public void setDigitallySigned(String digitallySigned) {
		this.digitallySigned = digitallySigned;
	}

	public String getConsumerViewable() {
		return consumerViewable;
	}

	public void setConsumerViewable(String consumerViewable) {
		this.consumerViewable = consumerViewable;
	}

	public String getConsumerDownloadble() {
		return consumerDownloadble;
	}

	public void setConsumerDownloadble(String consumerDownloadble) {
		this.consumerDownloadble = consumerDownloadble;
	}

	public String getOtaViewable() {
		return otaViewable;
	}

	public void setOtaViewable(String otaViewable) {
		this.otaViewable = otaViewable;
	}

	public String getOtaDownlable() {
		return otaDownlable;
	}

	public void setOtaDownlable(String otaDownlable) {
		this.otaDownlable = otaDownlable;
	}

	public Integer getApplicationDetailId() {
		return applicationDetailId;
	}

	public String getDealerDownloadable() {
		return dealerDownloadable;
	}

	public void setDealerDownloadable(String dealerDownloadable) {
		this.dealerDownloadable = dealerDownloadable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicationDescription == null) ? 0 : applicationDescription.hashCode());
		result = prime * result + ((applicationDetailId == null) ? 0 : applicationDetailId.hashCode());
		result = prime * result + ((applicationPartDetail == null) ? 0 : applicationPartDetail.hashCode());
		result = prime * result + ((compatibleAssemblies == null) ? 0 : compatibleAssemblies.hashCode());
		result = prime * result + ((consumerDownloadble == null) ? 0 : consumerDownloadble.hashCode());
		result = prime * result + ((consumerViewable == null) ? 0 : consumerViewable.hashCode());
		result = prime * result + ((dealerDownloadable == null) ? 0 : dealerDownloadable.hashCode());
		result = prime * result + ((digitallySigned == null) ? 0 : digitallySigned.hashCode());
		result = prime * result + ((functionalTypeValues == null) ? 0 : functionalTypeValues.hashCode());
		result = prime * result + ((otaDownlable == null) ? 0 : otaDownlable.hashCode());
		result = prime * result + ((otaViewable == null) ? 0 : otaViewable.hashCode());
		result = prime * result + ((residentOnVehicle == null) ? 0 : residentOnVehicle.hashCode());
		result = prime * result + ((sellable == null) ? 0 : sellable.hashCode());
		result = prime * result + ((serviceable == null) ? 0 : serviceable.hashCode());
		result = prime * result + ((subtype == null) ? 0 : subtype.hashCode());
		result = prime * result + ((testable == null) ? 0 : testable.hashCode());
		result = prime * result + ((values == null) ? 0 : values.hashCode());
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
		ApplicationDetail other = (ApplicationDetail) obj;
		if (applicationDescription == null) {
			if (other.applicationDescription != null)
				return false;
		} else if (!applicationDescription.equals(other.applicationDescription))
			return false;
		if (applicationDetailId == null) {
			if (other.applicationDetailId != null)
				return false;
		} else if (!applicationDetailId.equals(other.applicationDetailId))
			return false;
		if (applicationPartDetail == null) {
			if (other.applicationPartDetail != null)
				return false;
		} else if (!applicationPartDetail.equals(other.applicationPartDetail))
			return false;
		if (compatibleAssemblies == null) {
			if (other.compatibleAssemblies != null)
				return false;
		} else if (!compatibleAssemblies.equals(other.compatibleAssemblies))
			return false;
		if (consumerDownloadble == null) {
			if (other.consumerDownloadble != null)
				return false;
		} else if (!consumerDownloadble.equals(other.consumerDownloadble))
			return false;
		if (consumerViewable == null) {
			if (other.consumerViewable != null)
				return false;
		} else if (!consumerViewable.equals(other.consumerViewable))
			return false;
		if (dealerDownloadable == null) {
			if (other.dealerDownloadable != null)
				return false;
		} else if (!dealerDownloadable.equals(other.dealerDownloadable))
			return false;
		if (digitallySigned == null) {
			if (other.digitallySigned != null)
				return false;
		} else if (!digitallySigned.equals(other.digitallySigned))
			return false;
		if (functionalTypeValues == null) {
			if (other.functionalTypeValues != null)
				return false;
		} else if (!functionalTypeValues.equals(other.functionalTypeValues))
			return false;
		if (otaDownlable == null) {
			if (other.otaDownlable != null)
				return false;
		} else if (!otaDownlable.equals(other.otaDownlable))
			return false;
		if (otaViewable == null) {
			if (other.otaViewable != null)
				return false;
		} else if (!otaViewable.equals(other.otaViewable))
			return false;
		if (residentOnVehicle == null) {
			if (other.residentOnVehicle != null)
				return false;
		} else if (!residentOnVehicle.equals(other.residentOnVehicle))
			return false;
		if (sellable == null) {
			if (other.sellable != null)
				return false;
		} else if (!sellable.equals(other.sellable))
			return false;
		if (serviceable == null) {
			if (other.serviceable != null)
				return false;
		} else if (!serviceable.equals(other.serviceable))
			return false;
		if (subtype == null) {
			if (other.subtype != null)
				return false;
		} else if (!subtype.equals(other.subtype))
			return false;
		if (testable == null) {
			if (other.testable != null)
				return false;
		} else if (!testable.equals(other.testable))
			return false;
		if (values == null) {
			if (other.values != null)
				return false;
		} else if (!values.equals(other.values))
			return false;
		return true;
	}

	
}
