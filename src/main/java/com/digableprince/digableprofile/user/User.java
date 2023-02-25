package com.digableprince.digableprofile.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class User {
	private Integer id;
	
	@Size(min=2, max=55, message="Name should have at least 2 characters and no more than 55 characters")
	private String name;
	
	@Email(message="Please provide a valid email address")
	private String email;
	
	@Size(min=8, message="Password should have a minimum of 8 characters")
	private String password;

	public User(Integer id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
}
