package com.wtt.admin.adminEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Visit {
@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
String consumerName;
String consumerMobileNumber;
String installationStatus;
String reasonNotDone;
String Address;
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
public String getConsumerMobileNumber() {
	return consumerMobileNumber;
}
public void setConsumerMobileNumber(String consumerMobileNumber) {
	this.consumerMobileNumber = consumerMobileNumber;
}
public String getInstallationStatus() {
	return installationStatus;
}
public void setInstallationStatus(String installationStatus) {
	this.installationStatus = installationStatus;
}
public String getReasonNotDone() {
	return reasonNotDone;
}
public void setReasonNotDone(String reasonNotDone) {
	this.reasonNotDone = reasonNotDone;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
@Override
public String toString() {
	return "Visit [id=" + id + ", consumerName=" + consumerName + ", consumerMobileNumber=" + consumerMobileNumber + ", installationStatus=" + installationStatus
			+ ", reasonNotDone=" + reasonNotDone + ", Address=" + Address + "]";
}
public Visit(Long id, String consumerName, String consumerMobileNumber, String installationStatus, String reasonNotDone, String address) {
	super();
	this.id = id;
	this.consumerName = consumerName;
	this.consumerMobileNumber = consumerMobileNumber;
	this.installationStatus = installationStatus;
	this.reasonNotDone = reasonNotDone;
	this.Address = address;
}
public Visit() {
	super();
}
 
}
