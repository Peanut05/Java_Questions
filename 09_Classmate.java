package Homework2;

public class Classmate extends Notebook {
	
	// Hirarchiel Inheritance 
	
	int pages = 200;
	double price = 129;
	
	public static void main(String[] args) {
		
		Classmate c1 = new Classmate();
		c1.uses();
		System.out.println(c1.pages);
		System.out.println(c1.price);
		
	}
	
}
