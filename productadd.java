import java.util.*;
class Solution
{
    public static void main (String args[])
	{
    	int number,digit;
		int result;
		int sum=0,product=1;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		while(number>0)
		{
			digit=number%10;
			sum=sum+digit;
            product=product*digit;
			number=number/10;
		}
        result=product-sum;
        System.out.println(result);
}
}