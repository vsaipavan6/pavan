import java.util.*;
class array1
 {
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         int size,i;
         System.out.println("Enter array size:");
         size=sc.nextInt();
         int ar[];
         ar=new int[size];
         System.out.println("Enter array elements:"); 
         for(i=0;i<size;i++)
         { 
             ar[i]=sc.nextInt();
             } 
             int min=ar[0]; 
             for(i=1;i<size;i++)
             {
                 min=(int)(Math.min(ar[i],min));
                 } 
                 System.out.println("Minimum element is:" +min);
                 } 
     }