import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
       int reverse=0,remainder=0;
        int number;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        while(number!=0)
        {
            remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
		if(reverse>= Integer.max_value)
		{
			System.out.println("0");
		}
        System.out.println(reverse);
    }
}