package com.example.DemoUserApplicarionwithMongo1;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="users")
public class User {
	String id;
	String name,emailID;
	public User(String id, String name, String emailID) {
		super();
		this.id = id;
		this.name = name;
		this.emailID = emailID;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
}
