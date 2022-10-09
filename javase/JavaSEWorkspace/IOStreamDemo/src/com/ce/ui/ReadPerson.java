package com.ce.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import com.ce.model.Person;

public class ReadPerson {

	public static void main(String[] args) {
		try (
				FileInputStream fis = new FileInputStream("person.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			List<Person> persons = (List<Person>) ois.readObject();
			for(Person person : persons) {
				System.out.println(person);
			}
			
		} catch (IOException | ClassNotFoundException excep) {
			excep.printStackTrace();
		} 
	}

}
