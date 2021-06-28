import java.util.*;
class Alphabets
{
	public static void main(String args[])
	{
		boolean vowel=false;
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		switch(ch)
		{
			case 'a' :
	        case 'e' :
    	    case 'i' :
			case 'o' :
			case 'u' :
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' : vowel=true; break;
					
		}
		if(vowel==true)
		{
			System.out.println("Given alphabet "+ch+" is vowel" );
		}
		else {
	   if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println(ch+" is a Consonant");
	   else
		System.out.println("Input is not an alphabet");	
		}
	}
	
}