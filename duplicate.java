import java.util.*;
class Duplicatenumber 
{
 public static void main(String args[])
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
 System.out.println("Duplicate numbers are: "); 
for( i = 0; i < ar.length; i++) 
{ 
for(int j = i + 1; j < ar.length; j++) 
{ if(ar[i] == ar[j]) 
System.out.println(ar[j]); 
}
 }
 } 
}