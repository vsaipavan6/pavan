import java.util.*;
class array1
 {
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         int size,i,n=0;
         System.out.println("Enter array size:");
         size=sc.nextInt();
         int ar[];
         ar=new int[size];
         System.out.println("Enter array elements:"); 
         for(i=0;i<size;i++)
           { 
             ar[i]=sc.nextInt();
           } 
          for(i=0;i<size;i++)
          {
            n=ar[i];
            if(n!=0)
            {
              System.out.print(" "+n);
            }
          }
          
          for(i=0;i<size;i++)
          {
            n=ar[i];
            if(n==0)
            {
              System.out.print(" "+n);
            }
          }
     }
 }