package com.digableprince.digableprofile.contact;

import java.time.LocalDate;

public class Contact {
	private Integer id;
	private String name;
	private String email;
	private String messsage;
	private LocalDate createdAt;

	public Contact(Integer id, String name, String email, String messsage, LocalDate createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.messsage = messsage;
		this.createdAt = createdAt;
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

	public String getMesssage() {
		return messsage;
	}

	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", email=" + email + ", messsage=" + messsage + ", createdAt="
				+ createdAt + "]";
	}

}
