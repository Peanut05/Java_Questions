package Homework2;

public class Employee extends Company{
	//Single Level Inheritance
	String empName = "Aman Chandan";
	double empSal = 40000;

public static void main(String[] args) {
	
	Employee e1 = new Employee();
	
	System.out.println("Company Name :"+e1.compName);
	System.out.println("Company Area :"+e1.cmopArea);
	System.out.println("Employe Name :"+e1.empName);
	System.out.println("Employe Salary :"+e1.empSal);
	
	
}
	
}
