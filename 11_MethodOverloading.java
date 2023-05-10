package Q3Polymorphism;

public class MethodOverloading {
	
	// Method Overloading .......
	
	public static void main(String[] args) {
		mul();
		mul(10,20);
		mul(10,20,30);
	}
	
	public static void mul() {
		System.out.println("Hello From Mul.....");
	}
	
	public static void mul(int a,int b) {
		int multiplication = a*b;
		System.out.println(multiplication);
	}
	
	public static void mul(int a,int b,int c) {
		int multiplication = a*b*c;
		System.out.println(multiplication);
	}

}
