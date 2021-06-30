import java.util.*;
class Replace
{
	public static void main(String args[])
	{
		int number,x,y;
		int d=1;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		x=sc.nextInt();
		y=sc.nextInt();
		int replace=0;
		int rem;
		while(number!=0)

		{
			rem=number%10;
			if(rem==x)
				replace=replace+y*d;
			else
				replace=replace+rem*d;
			d=d*10;
			number=number/10;
		}
		System.out.println(replace);
	}
}