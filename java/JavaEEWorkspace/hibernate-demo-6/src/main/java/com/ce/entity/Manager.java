package com.ce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
// @DiscriminatorValue("M")

// @Table(name = "mgrs")

@Table(name = "mgrs_only")
public class Manager extends Emp {
	@Column(name = "hra")
	private double hra;
	public Manager() {
		/* default constructor */
	}
	public Manager(int empNo, String eName, double sal, double hra) {
		super(empNo, eName, sal);
		this.hra = hra;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	@Override
	public String toString() {
		return String.format("Manager [hra=%s, Hra=%s, EmpNo=%s, Ename=%s, sal=%s]", hra, getHra(),
				getEmpNo(), geteName(), getSal());
	}
	
	
}
