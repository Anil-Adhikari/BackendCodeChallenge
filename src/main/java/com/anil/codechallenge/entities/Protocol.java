package com.anil.codechallenge.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.anil.codechallenge.enums.NetworkProtocol;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "protocol")
public class Protocol {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="protocol_id")
	@JsonIgnore
	private Integer protocolId;
	
	private String networkWireless;
	
	@Enumerated
	private NetworkProtocol networkProtocol;
	
	public Protocol() {

	}

	public Protocol(String networkWireless, NetworkProtocol networkProtocol) {
		super();
		this.networkWireless = networkWireless;
		this.networkProtocol = networkProtocol;
	}

	public Integer getProtocolId() {
		return protocolId;
	}

	public String getNetworkWireless() {
		return networkWireless;
	}

	public void setNetworkWireless(String networkWireless) {
		this.networkWireless = networkWireless;
	}

	public NetworkProtocol getNetworkProtocol() {
		return networkProtocol;
	}

	public void setNetworkProtocol(NetworkProtocol networkProtocol) {
		this.networkProtocol = networkProtocol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((networkProtocol == null) ? 0 : networkProtocol.hashCode());
		result = prime * result + ((networkWireless == null) ? 0 : networkWireless.hashCode());
		result = prime * result + ((protocolId == null) ? 0 : protocolId.hashCode());
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
		Protocol other = (Protocol) obj;
		if (networkProtocol != other.networkProtocol)
			return false;
		if (networkWireless == null) {
			if (other.networkWireless != null)
				return false;
		} else if (!networkWireless.equals(other.networkWireless))
			return false;
		if (protocolId == null) {
			if (other.protocolId != null)
				return false;
		} else if (!protocolId.equals(other.protocolId))
			return false;
		return true;
	}
	
	
}
