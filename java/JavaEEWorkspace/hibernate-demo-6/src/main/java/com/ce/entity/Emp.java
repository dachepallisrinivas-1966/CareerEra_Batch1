package com.ce.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "all_emps")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "emp_type", discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue("E")
public class Emp {
	@Id
	@Column(name = "eid")
	private int empNo;
	private String eName;
	private double sal;
	public Emp() {
		/* default constructor */
	}
	public Emp(int empNo, String eName, double sal) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.sal = sal;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return String.format("Emp [empNo=%s, eName=%s, sal=%s]", empNo, eName, sal);
	}
	
}
