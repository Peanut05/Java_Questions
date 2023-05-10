package Q3Polymorphism;

public class Chield {
	
	// Method Overriding ....
	
		public void PrintHello() {
			System.out.println("Hello From Chield .....");
		}
	
	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		p1.PrintHello();
		
		Chield c1 = new Chield();
		c1.PrintHello();
		
		
	}

}
