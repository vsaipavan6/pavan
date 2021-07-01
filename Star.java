import java.util.*;
class Stark
{
public static void main(String args[])
{
int i,j,n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++)
{
	for(j=n;j>=i;j--)
	{
		System.out.print("*");
	}
	System.out.println("\n");
}
}
}
