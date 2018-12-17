//package com.genpact.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.Table;
//
//import org.hibernate.annotations.ManyToAny;
//
//@Entity
//@Table(name = "role")
//public class Role {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "roles_id")
//	private int role_id;
//	@Column(name = "role_name")
//	private String role_name;
//	@Column(name = "created_date")
//	private java.sql.Date created_date;
//	@Column(name = "updated_date")
//	private java.sql.Date updated_date;
//	@Column(name = "is_active")
//	private boolean is_active;
//	
//	
////	@ManyToAny(metaColumn = @Column)
////	@JoinColumn(name=  "user_id")
//	private User user;
//
//	public Role() {
//	}
//
//	public int getRole_id() {
//		return role_id;
//	}
//
//	public void setRole_id(int role_id) {
//		this.role_id = role_id;
//	}
//
//	public String getRole_name() {
//		return role_name;
//	}
//
//	public void setRole_name(String role_name) {
//		this.role_name = role_name;
//	}
//
//	public java.sql.Date getCreated_date() {
//		return created_date;
//	}
//
//	public void setCreated_date(java.sql.Date created_date) {
//		this.created_date = created_date;
//	}
//
//	public java.sql.Date getUpdated_date() {
//		return updated_date;
//	}
//
//	public void setUpdated_date(java.sql.Date updated_date) {
//		this.updated_date = updated_date;
//	}
//
//	public boolean isIs_active() {
//		return is_active;
//	}
//
//	public void setIs_active(boolean is_active) {
//		this.is_active = is_active;
//	}
//
//	
//}
