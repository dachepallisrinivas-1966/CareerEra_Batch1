package com.ce.ui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import com.ce.model.Person;

public class WritePerson {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("srinivas", 56, 124),
				new Person("john", 45, 345),
				new Person("david", 33, 456)
		);
		try (
				FileOutputStream fos = new FileOutputStream("person.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			oos.writeObject(persons);
			
		} catch (IOException excep) {
			excep.printStackTrace();
		} 
	}

}
