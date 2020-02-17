/*
 * Name: James Sigler
 * R#: R11481310
 * Assignment: Math to Strings
 * */

import java.util.*;

class StringHelper
{
	
	public static String NToS(int number)
	{
		switch(number)
		{
			case 0: 
				return "zero";
			case 1: 
				return "one";
			case 2: 
				return "two";
			case 3:	
				return "three";
			case 4:	
				return "four";
			case 5: 
				return "five";
			case 6: 
				return "six";
			case 7:	
				return "seven";
			case 8:	
				return "eight";
			case 9: 
				return "nine";
		}
		return null; 
	}
	
	public void calculate(String equation)
	{
		
		if(equation.length() != 3)
		{
			System.out.print("Invalid Number");
			return;
		}
		
		char sign = equation.charAt(1);
		
		int numOne = equation.charAt(0)-48;
		int numTwo = equation.charAt(2)-48;
		
		String numStrOne = NToS(numOne); 
		String numStrTwo = NToS(numTwo); 
		
		switch(sign)
		{
			case '+':
			{
				System.out.println(numStrOne + " plus " + numStrTwo + " is " + (numOne+numTwo));
				break;
			}
			case '-':
			{
				System.out.println(numStrOne + " minus " + numStrTwo + " is " + (numOne-numTwo));
				break;
			}
			case '*':
			{
				System.out.println(numStrOne + " multiplied by " + numStrTwo + " is " + (numOne*numTwo));
				break;
			}
			case '/':
			{
				if(numTwo != 0)
				{
					System.out.println(numStrOne + " divided by " + numStrTwo + " is " + (numOne/numTwo));
				}
				else
				{
					System.out.println("Division by zero is not allowed");
				}
				break;
			}
			case '^':
			{
				System.out.println(numStrOne + " to the power of " + numStrTwo + " is " + (Math.pow(numOne, numTwo)));
				break;
			}
			default:
			{
				System.out.println("Invalid Operator");
				break;
			}
		}
	}
}


public class TestStrings 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		StringHelper MathStr = new StringHelper();
		
		System.out.print("Enter Your Equation: ");
		String inp = input.nextLine();
		String Equ = inp.replaceAll("\\s","");	
		
		MathStr.calculate(Equ);
		
		input.close();
	}
}
