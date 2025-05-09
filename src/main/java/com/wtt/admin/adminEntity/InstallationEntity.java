package com.wtt.admin.adminEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InstallationEntity {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	Long id;
	String consumerName;
	String consumerEmail;
	String consumerAddress;
	String installationStatus;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	public String getConsumerEmail() {
		return consumerEmail;
	}
	public void setConsumerEmail(String consumerEmail) {
		this.consumerEmail = consumerEmail;
	}
	public String getConsumerAddress() {
		return consumerAddress;
	}
	public void setConsumerAddress(String consumerEmail, String consumerAddress) {
		this.consumerAddress = consumerAddress;
	}

	public String getinstallationStatus() {
		return installationStatus;
	}
	public void setinstallationStatus(String installationStatus) {
		this.installationStatus = installationStatus;
	}
	@Override
	public String toString() {
		return "ConsumerEntityy [id=" + id + ", consumerName=" + consumerName + ", consumerEmail=" + consumerEmail
				+ ", consumerAddress=" + consumerAddress + ", installationStatus=" + installationStatus + "]";
	}
	public InstallationEntity(Long id, String consumerName, String consumerEmail, String consumerNumber,
			String installationStatus, String consumerAddress) {
		super();
		this.id = id;
		this.consumerName = consumerName;
		this.consumerEmail = consumerEmail;
		this.consumerAddress = consumerAddress;
		this.installationStatus = installationStatus;
	}
	public InstallationEntity() {
		super();
	}


}
