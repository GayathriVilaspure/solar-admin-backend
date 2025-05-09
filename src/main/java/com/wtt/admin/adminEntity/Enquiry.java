package com.wtt.admin.adminEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Enquiry {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
	String name;
	String number;
	String address;
    String kw;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getKw() {
		return kw;
	}
	public void setKw(String kw) {
		this.kw = kw;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Enquiry(Long id, String name, String number, String kw, String address) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.kw = kw;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Enquiry [id=" + id + ", name=" + name + ", number=" + number + ", kw=" + kw + ", address=" + address
				+ "]";
	}
	public Enquiry() {
		super();
	}
	
}
