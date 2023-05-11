import java.util.*;
public class numberInBetween{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number :");
int num = sc.nextInt();
 if(num<=10)
{
System.out.println("Number in Between 1-10");
}
else{
throw NumberIsNotBetweenRangeExeption();
}

}
