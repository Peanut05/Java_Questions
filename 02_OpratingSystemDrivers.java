package Homework2;

public class OpratingSystemDrivers {
	
	public static void main(String[] args) {
		
		OpratingSystem s1 = new OpratingSystem();
		
		// Printing Values of OS class 
		
		System.out.println(s1.getName());
		System.out.println(s1.getPrice());
		System.out.println(s1.getSpeciallity());
		
		// Updating Values using setter methods 
		
		s1.setName("Windows");
		s1.setPrice(14000);
		s1.setSpeciallity("MS Office");
		
		// Printing Updated Values 
		
		System.out.println(s1.getName());
		System.out.println(s1.getPrice());
		System.out.println(s1.getSpeciallity());
		
		s1.setName("Kali Linux");
		s1.setPrice(0);
		s1.setSpeciallity("Linux Kernel");
		
		System.out.println(s1.getName());
		System.out.println(s1.getPrice());
		System.out.println(s1.getSpeciallity());
		
	}

}
