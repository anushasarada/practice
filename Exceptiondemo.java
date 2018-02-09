import java.lang.*;
import java.util.*;

class Exceptiondemo
{
	public static void main(String args[])
	{
		int num1,num2,c;
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		try
		{
			c=num1/num2;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("divide by zero error");
		}
		catch(NumberFormatException nf)
		{
			System.out.println("numberformat exception");
		}
	}
}