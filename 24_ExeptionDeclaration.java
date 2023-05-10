package Q7Exeption;

public class ExeptionDeclaration {

//Exteption Declaration ....
  
	public static void main(String[] args) {
		System.out.println("Main Start ....");
		
		div();
		
		System.out.println("Main End ....");
	}
	
	public static void div() throws ArithmaticExteption , NullPointerExeption
	{
		int a = 10;
		int b = 0;
		int res = a/b;
		System.out.println(res);
	}
	
}
