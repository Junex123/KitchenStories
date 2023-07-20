package com.project.kitchenstories.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class bookingdetail {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String email;
private LocalDateTime datetime;
private String select1;
private String message;
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
public LocalDateTime getDatetime() {
	return datetime;
}
public void setDatetime(LocalDateTime datetime) {
	this.datetime = datetime;
}
public String getSelect1() {
	return select1;
}
public void setSelect1(String select1) {
	this.select1 = select1;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}


}
