import java.util.*;
class Stark2
{
public static void main(String args[])
{
	int i,j,rows;
	Scanner sc=new Scanner(System.in);
	rows=sc.nextInt();
	char ch='A';
	for(i=1;i<=rows;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(ch+" ");
			ch++;
		}
		System.out.println();
	}
}
}