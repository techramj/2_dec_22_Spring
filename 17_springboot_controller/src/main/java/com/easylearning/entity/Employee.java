package com.easylearning.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;

}
