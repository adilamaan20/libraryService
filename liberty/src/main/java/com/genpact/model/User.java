package com.genpact.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "entity")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int user_id;
	
//	@Column(name = "username")
//	private String username;
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "last_name")
	private String last_name;
	@Column(name = "email")
	public String email;
	
	@Column(name = "phone_no")
	private int phone_no;
	
	@Column(name = "age")
	private int age;
	@Column(name = "password")
	private String password;
	@Column(name = "is_active")
	private boolean is_active;

	@Column(name = "created_date")
	private java.sql.Date created_date;
	@Column(name = "updated_date")
	private java.sql.Date updated_date;
	
	public User() {
	}
	
	
	

	public User(String first_name, String last_name, String email, int phone_no, int age, String password,
			boolean is_active, Date created_date, Date updated_date) {
		//super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_no = phone_no;
		this.age = age;
		this.password = password;
		this.is_active = is_active;
		this.created_date = created_date;
		this.updated_date = updated_date;
	}




	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public java.sql.Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(java.sql.Date created_date) {
		this.created_date = created_date;
	}

	public java.sql.Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(java.sql.Date updated_date) {
		this.updated_date = updated_date;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + ", phone_no=" + phone_no + ", age=" + age + ", password=" + password + ", is_active="
				+ is_active + ", created_date=" + created_date + ", updated_date=" + updated_date + "]";
	}
	
	

}
	
	
	
	
	
	
	
	
//	public User(String username, String firstname, String lastname, int age, String email, String password) {
//	//	super();
//		this.username = username;
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.age = age;
//		this.email = email;
//		this.password = password;
//		this.active = false;
//	}
//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//@JoinColumns
//@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//@JoinColumns({
//   @JoinColumn(name = "role", referencedColumnName = "role_id")
//
//})
//(value = { @JoinColumn })

