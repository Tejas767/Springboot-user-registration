package com.register.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	private String name;
	@Override
	public String toString() {
		return "MyEntity [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phone="
				+ phone + "]";
	}
	private String email;
	public User(int id, String name, String email, String password, String phone) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	private String password;
	private String phone;
	
	
	public User() {
		
	}
}
