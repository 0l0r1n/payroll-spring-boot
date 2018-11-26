package com.payroll;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Getter @Setter
@Entity
class Employee {

	private @Id @GeneratedValue Long id;
	private String name;
	private String role;

	Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}
	
}