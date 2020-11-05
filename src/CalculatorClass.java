import java.util.*;

public class CalculatorClass {
	public static void main(String[] args)
	{
		functions();
		anotherTime();
		
	}
	static void functions()
	{
		int fnum = 0;
		int nnum =0;
		char sign;
		double result = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the first number:");
		fnum = scanner.nextInt();
		System.out.println("enter the second number:");
		nnum = scanner.nextInt();
		System.out.println("enter the operand:");
		sign = scanner.next().charAt(0);
		
		switch(sign)
		{
		case '+': result = fnum+nnum;
			break;
		case '-': result = fnum-nnum;
			break;
		case '*': result = fnum*nnum;
			break;
		case '/': result = fnum/nnum;
			break;
		}
		System.out.println(fnum+ " " + sign + " " + nnum + " = " + result);
		
	}
	static void anotherTime()
	{
		Scanner scanner = new Scanner(System.in);
		char yn = ' ';
		System.out.println("would you like to do another operation? y or n");
		yn = scanner.next().charAt(0);
		switch(yn)
		{
		case 'y':
			functions();
		case 'n':
			break;
			
		}
	}
}
