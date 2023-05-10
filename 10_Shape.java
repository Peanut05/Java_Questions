package Homework2;

public class Shape extends Notebook {
	 
	// Hirarchiel Inheritance
	
	int pages = 300;
	double price = 200;
	
	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		s1.uses();
		System.out.println(s1.pages);
		System.out.println(s1.price);
		
	}
}
