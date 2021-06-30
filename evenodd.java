import java.util.*;
class Digits
{
	public static void main(String args[])
	{
		long number;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		number=sc.nextLong();
		int odd=0,even=0;
		long odd1=0,even1=0;
		   while(number!=0)
		{
			long rem=number%10;
			if(rem%2==1)
			{
             odd++;
			 odd1=odd1*10+rem;
		
			}
			else
			{
             even++;
			even1=even1*10+rem;
			
			}
			number=number/10;
		}
			System.out.println("the odd digits are :"+odd1);
			System.out.println("the even digits are :"+even1);
		System.out.println("THE NUMBER OF ODD DIGITS IS -:"+odd);
		System.out.println("THE NUMBER OF EVEN DIGITS IS -:"+even);
	}
}