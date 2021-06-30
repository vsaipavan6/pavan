import java.util.*;
class Harshad
{
	public static void main (String args[])
	{
		int number,digit;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		while(number>0)
		{
			digit=number%10;
			sum=sum+digit;
			number=number/10;
		}
		if(number%sum==0)
		System.out.println("Given number is harshad number");
		else
		System.out.println("Given number is not harshad number");	
	}
}
