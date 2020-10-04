package com.ubaiid.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int id;
	private String name;
	private String email;
	private String password;
	private Date birthday;
	private String gender;
	private String profession;
	private boolean married;
	private String note;
	
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public String toString() {
		//return "User ---> [ UserID=" + id + ",   FullName=" + name + ",	  Email=" + email + ",   Password=" + password +",    DOB=" + birthday+ ",  Gender="+  gender + ", IsMarried=" + married + ",   Note ="+ note + "] <br/> <br/>  ";
     return " UserID = " + id + "<br/> FullName=" + name + "<br/> Email=" + email + "<br/> Password=" + password +"<br/> DOB=" + birthday+ "<br/> Gender="+  gender + "<br/> IsMarried=" + married + "<br/> Note ="+ note + "<br/> <br/>  ";
	}

}
