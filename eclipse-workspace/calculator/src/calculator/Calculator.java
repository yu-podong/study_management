package calculator;
import java.util.Scanner;

public class Calculator {
	public static void main(String args[])
	{
		Scanner num = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오.: ");
		String a = num.nextLine();
		System.out.print("연산 기호를 입력하시오.: ");
		String op = num.nextLine();
		System.out.print("숫자를 입력하시오.: ");
		String b = num.nextLine();
		
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		int num3=0;
		
		if((op.equals("+")))
		{
		    num3 = num1+num2;
		}
		
		else if((op.equals("-")))
		{
		    num3 = num1-num2;
		}
		
		else if((op.equals("*")))
		{
		    num3 = num1*num2;
		}
		
		else if ((op.equals("/")))
		{
			if (b.equals("0"))
			{
				System.out.println("다시 입력하십시오.");
			}
		    num3 = num1/num2;
		}
	    
		System.out.print(num3);	
	}
}

class User
{
	
}

