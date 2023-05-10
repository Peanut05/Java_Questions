package Homework2;

public class City extends Salary {
	
  //Multi Level Inheritance
  
	String emp1City = "Pune";
	String emp2City = "Odisa";
	String emp3City = "Mumbai";
	

	public static void main(String[] args) {
		
		City c1 = new City();
		
		System.out.println("First Employe Details :");
		System.out.println("Name: "+c1.emp1Name);
		System.out.println( "Salary :"+c1.emp1Sal);
		System.out.println("City :"+c1.emp1City);
		
		System.out.println("Second Employe Details :");
		System.out.println("Name: "+c1.emp2Name);
		System.out.println( "Salary :"+c1.emp2Sal);
		System.out.println("City :"+c1.emp2City);
		
		System.out.println("Third Employe Details :");
		System.out.println("Name: "+c1.emp3Name);
		System.out.println( "Salary :"+c1.emp3Sal);
		System.out.println("City :"+c1.emp3City);
		
	}

}
