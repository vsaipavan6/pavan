import java.util.*;
class automorphic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem,rem1;
		rem=n%100;
		rem1=rem*rem;
		if(rem1==n)
		{
			System.out.println("AUTOMORPHIC NUMBER");
		}
		else
		{
			System.out.println("NOT AUTOMORPHIC NUMBER");
		}

	}
}