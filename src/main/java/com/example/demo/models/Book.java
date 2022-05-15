package com.example.demo.models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Book {
	@Column(name="ISBN")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter(value = AccessLevel.NONE)
	private int isbn;

	@Column(name="Year")
	@Max(1900)
	@Min(2022)
	private int year;
	
	@Column(name="Author")
	@NotNull
	@Pattern(regexp="[A-Z]{1}[a-z]+", message = "Jabut pirmajam lielajam burtam, un parejie var but mazie") 	
	private String author;

	@Column(name="Author")
	@NotNull
	@Pattern(regexp="[A-Z]{1}[a-z]+", message = "Jabut pirmajam lielajam burtam, un parejie var but mazie")
	private String title;
	
	private Rating rating;
	
	private Condition condition;
	
	private Rarity rarity;
	
	
	

}
