import java.util.*;
class Stark2
{
public static void main(String args[])
{
int i,j,rows;
Scanner sc=new Scanner(System.in);
rows=sc.nextInt();
for(i=1;i<=rows;i++)
{
	for(j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println("\n");
}
for(i=1;i<rows;i++)
{
	for(j=rows;j>i;j--)
	{
		System.out.print("*");
	}
	System.out.println("\n");
}
}
}
