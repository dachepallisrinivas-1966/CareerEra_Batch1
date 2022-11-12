package com.ce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
// @DiscriminatorValue("C")

// @Table(name = "cemps")

@Table(name = "cems_only")
public class ContractEmployee extends Emp{
	@Column(name = "cdur")
	private int contractDur;
	public ContractEmployee() {
		/* default constructor*/
	}
	public ContractEmployee(int empNo, String eName, double sal, int contractDur) {
		super(empNo, eName, sal);
		this.contractDur = contractDur;
	}
	public int getContractDur() {
		return contractDur;
	}
	public void setContractDur(int contractDur) {
		this.contractDur = contractDur;
	}
	@Override
	public String toString() {
		return String.format("ContractEmployee [contractDur=%s, getEmpNo()=%s, geteName()=%s, getSal()=%s]",
				contractDur, getEmpNo(), geteName(), getSal());
	}
	
}
