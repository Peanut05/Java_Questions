package Q5Abstarction;

public class AbstractionDriver extends Abstarction {
	
	public void add() {
		System.out.println("Thid Method is made for addition ....");
		
	}
	
	public void mul() {
		System.out.println("This Methid is made for Multiplication ....");
	}

	public static void main(String[] args) {
		
		AbstractionDriver a1 = new AbstractionDriver();
		
		a1.add();
		a1.mul();
		
	}

}
