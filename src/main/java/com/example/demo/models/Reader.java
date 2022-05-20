package com.example.demo.models;

import java.util.Collection;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@NoArgsConstructor
@ToString
public class Reader extends Person {

	private int libraryUserNumber;
	private Collection<Book> currentTakenBookList;
	
	
	
	public Collection<Book> loadHistory()
	{
		return currentTakenBookList;
	}
	
	public Reader(String name, String surname, String personalCode, int libraryUserNumber,
			Collection<Book> currentTakenBookList) {
		super(name, surname, personalCode);
		this.libraryUserNumber = libraryUserNumber;
		this.currentTakenBookList = currentTakenBookList;
	}
	

	
	
}
