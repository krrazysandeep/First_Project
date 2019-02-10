package test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hiberntae")
public class Employee 
{
	@Id
	@Column(name="eno")
private int empno;
	@Column(name="ename")
	
private String empname;
	@Column(name="address")
private String address;
	

	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", address=" + address + "]";
	}


	
	}
	

