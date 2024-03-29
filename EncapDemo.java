/*
Demo of encapsulation as a part of Object-Oriented Programming.

In a nutshell:
      (i) making private field variables accessible directly from outside the class.
      (ii) having getter and setter methods in the class to set and get the values of the fields.

*/

//  hetre is my edit


package oops.demo;

public class EncapDemo {

	
	// 3 private fields (private variables)
	private int ssn;
	private String empName;
	private int empAge;

	// 3 getter methods	
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	// 3 setter methods	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}


	
	// publishing those 3 private variables (fields) through the main method (a public method)		
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
