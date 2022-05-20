package com.example.demo.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class Person {
	private String name;
	private String surname;
	private String personalCode;

	
	
	public Person(String name, String surname, String personalCode) {
		super();
		this.name = name;
		this.surname = surname;
		this.personalCode = personalCode;
	}
	
	
	
	
}
