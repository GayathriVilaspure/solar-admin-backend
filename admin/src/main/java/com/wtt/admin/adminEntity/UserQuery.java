package com.wtt.admin.adminEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserQuery {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
String consumerName;
String consumerNumber;
String consumerEmail;
String queries;
public UserQuery(Long id, String consumerName, String consumerNumber, String consumerEmail, String queries) {
	super();
	this.id = id;
	this.consumerName = consumerName;
	this.consumerNumber = consumerNumber;
	this.consumerEmail = consumerEmail;
	this.queries = queries;
}
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
public String getConsumerNumber() {
	return consumerNumber;
}
public void setConsumerNumber(String cosnumerNumber) {
	this.consumerNumber = cosnumerNumber;
}
public String getConsumerEmail() {
	return consumerEmail;
}
public void setConsumerEmail(String consumerEmail) {
	this.consumerEmail = consumerEmail;
}
public String getQueries() {
	return queries;
}
public void setQueries(String queries) {
	this.queries = queries;
}
public UserQuery() {
	super();
}
@Override
public String toString() {
	return "UserQuery [id=" + id + ", consumerName=" + consumerName + ", consumerNumber=" + consumerNumber
			+ ", consumerEmail=" + consumerEmail + ", queries=" + queries + "]";
}
}
