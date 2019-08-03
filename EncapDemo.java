/*
Demo of encapsulation as a part of Object-Oriented Programming.

In a nutshell:
      (i) making private field variables accessible directly from outside the class.
      (ii) having getter and setter methods in the class to set and get the values of the fields.

*/




package oops.demo;

public class EncapDemo {

	private int ssn;
	private String empName;
	private int empAge;

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public static void main(String[] args) {

		EncapDemo ed = new EncapDemo();
		ed.setEmpAge(34);
		ed.setEmpName("Ameer");
		ed.setSsn(123456);

		System.out.println("The name of the employee is : " + ed.getEmpName());
		System.out.println("The age of the employee is : " + ed.getEmpAge());
		System.out.println("The ssn of the employee is : " + ed.getSsn());

	}

}



Output:
The name of the employee is : Ameer
The age of the employee is : 34
The ssn of the employee is : 123456
