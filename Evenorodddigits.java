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
		   while(number!=0)
		{
			long rem=number%10;
			if(rem%2==1)
             odd++;
			else
             even++;
			number=number/10;
		}
		System.out.println("THE NUMBER OF ODD DIGITS IS -:"+odd);
		System.out.println("THE NUMBER OF EVEN DIGITS IS -:"+even);
	}
}