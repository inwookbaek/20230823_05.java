package com.lec.pkg.getset;

import java.util.Date;

public class Employee {

	private int empno;
	private String ename;
	private String hiredate;
	private int sal;
	private int deptno;
	private boolean adult;
	private String ssn;
	private boolean 질병;
	private boolean 관리자;
	
	public Employee(int empno, String ename, String hiredate, int sal, int deptno, boolean adult, String ssn, boolean 질병,
			boolean 관리자) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.hiredate = hiredate;
		this.sal = sal;
		this.deptno = deptno;
		this.adult = adult;
		this.ssn = ssn;
		this.질병 = 질병;
		this.관리자 = 관리자;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public boolean isAdult() {
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public boolean is질병() {
		if(this.관리자) 
			return 질병;
		else {
			return false;
		}
			
	}
	public void set질병(boolean 질병) {
		this.질병 = 질병;
	}
	public boolean is관리자() {
		return 관리자;
	}
	public void set관리자(boolean 관리자) {
		this.관리자 = 관리자;
	}
	
}
