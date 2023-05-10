package Q3Polymorphism;

public class ConstrutorOverloading {
	
	// Constructor Overloading .....
	
	long mobileNo ;
	String city;
	ConstrutorOverloading(){
		System.out.println("This is default Constructor");
	}
	
	ConstrutorOverloading(long mobileNo , String city){
		this.mobileNo = mobileNo;
		this.city = city;
		
	}
	
	public static void main(String[] args) {
		
		ConstrutorOverloading c1 = new ConstrutorOverloading();
		System.out.println("Default Values of constructor is :");
		System.out.println(c1.mobileNo);
		System.out.println(c1.city);
		
		ConstrutorOverloading c2 = new ConstrutorOverloading(10293771 , "Pune");
		System.out.println("Passed Values of constructor is :");
		System.out.println(c2.mobileNo);
		System.out.println(c2.city);
	}
	
	

}
