package com.ce.ui;

import com.ce.model.Employee;
import com.ce.model.Manager;
import com.ce.model.Person;
import com.ce.model.Student;

public class InheritanceApp {

	public static void main(String[] args) {
//		Person p1 = new Person("srinivas", 57);
//		System.out.println(p1.getName() + "\t" + p1.getAge());
		
		Student s1 = new Student("divya", 19, 50000.0);
		System.out.println(s1.getName() + "\t" + s1.getAge() + "\t" + s1.getFee());
		Employee e1 = new Employee("ramana", 26, 45000.0);
		System.out.println(e1.getName() + "\t" + e1.getAge() + "\t" + e1.getSalary());
		Manager m1 = new Manager("swamy", 50, 80000.0, 15000.0);
		System.out.println(m1.getName() + "\t" + m1.getAge() + "\t" + m1.getSalary() + "\t"
					+ m1.getAllowance());
	}

}
