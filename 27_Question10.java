public class Test {

   public static void main (String args[]){

      int i= 20; // premitive value

      Integer i = Integer.ValueOf(i);

      System.out.println(i); //wrapper class object *Boxing

      int b = i.intValue();
      System.out.println(b); // premitive value *unboxing
     
      String s1 = new String("Hello");
      System.out.println(s1); //String
     
     int d = Integer.parseInt(s1); // Parsing
     System.out.println(d); // Premitive
   }

}
