package com.digableprince.digableprofile.contact;

public class contact {
	private String name;
	private String email;
	private String messsage;

	public contact(String name, String email, String messsage) {
		super();
		this.name = name;
		this.email = email;
		this.messsage = messsage;
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

	@Override
	public String toString() {
		return "contact [name=" + name + ", email=" + email + ", messsage=" + messsage + "]";
	}

}
