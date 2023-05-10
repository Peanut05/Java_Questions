package Q7Exeption;

// Exeption Handling

public class ExeptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Main Start ....");
		
		try {
		int arr[]= null;
		System.out.println(arr[1]);
		}
		catch(NullPointerException p) {
			System.out.println("Array is null");
		}
		
		System.out.println("Main End ....");
	}
	

}
