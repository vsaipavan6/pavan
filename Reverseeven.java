import java.util.*;
class ReverseEven
{
	public static void main(String args[])
	{
		int n,m;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE HIGHEST DIGIT");
		n=sc.nextInt();
		System.out.println("ENTER THE LOWEST DIGIT");
		m=sc.nextInt();
		while(m>=n)
		{
			if(m%2==0)
			{
			System.out.println(m);
			
			}
			m--;
		}
	}
}