import java.util.Scanner;  
import java.util.*;
class Prime 
{ 
 
   public static void main(String[] args)
   {  
		int a, b, i, j, flag;
		int count=0;
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter the first number : ");  
       a = s.nextInt();  
       System.out.print("Enter the second number : ");  
       b = s.nextInt();  
       System.out.println("No of prime numbers between " + a + " and " + b);  
       for (i = a; i <= b; i++) {

            if (i == 1 || i == 0)
                continue;

            flag = 1;
 
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
 
            if (flag == 1)
                count=count+1;
		
        }
		System.out.println(count);
	}
}
     