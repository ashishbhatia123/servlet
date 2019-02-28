package com.cg.hr.core.beans;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="emp1")   // this employee class is map with emp1
public class Employee {
	@Id  //  for mapping with primary key
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="emp_id", length =10) // if not write @column than it asking for mapping with
	@OrderBy
	private int empId;
	
	@Column(name = "emp_name" , length =20)
private String empName;
	
	@Column(name = "emp_sal" , length =10)
private float empSal;
	
	
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


public Employee(int empId, String empName, float empSal) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSal = empSal;
	
}


public int getEmpId() {			//propertyName = empId
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public float getEmpSal() {
	return empSal;
}
public void setEmpSal(float empSal) {
	this.empSal = empSal;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal+ "]";
}



}
