package Q3Polymorphism;

public class MethodShadowingDriver extends MethodShadowing{
	
	// Method Shodowing ....
	
	public void printHello() {
		System.out.println("Hello from chield .....");
	}
	int i1 = 101;
	
	public static void main(String[] args) {
		
		MethodShadowing m1 = new MethodShadowing();
		MethodShadowingDriver m2 = new MethodShadowingDriver();
		
		System.out.println("Parent Class Members ....");
		m1.printHello();
		System.out.println(m1.i1);
		
		System.out.println("Chield Class Members ....");
		m2.printHello();
		System.out.println(m2.i1);
		
		
	}

}
