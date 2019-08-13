package io.pukhraj.model;

import javax.inject.Inject;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Person {
	
	 
	private int id;
	private String name;
	private String phone;
	private String street,city,pin;
	
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Person() {
		
	}
	
	public int getId() {
		return id;
	}
	public Person(int id, String name, String phone, String street, String city, String pin) {
		 
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.street=street;
		this.city=city;
		this.pin=pin;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phoneNumber) {
		this.phone = phoneNumber;
	}
	
	
}
