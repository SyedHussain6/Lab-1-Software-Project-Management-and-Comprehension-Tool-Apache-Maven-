package com.ontariotechu.sofe3980U;

//importing scanner
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program: The entry point of the program. It creates two binary variables, adds them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		Scanner s = new Scanner(System.in);

		//taking input for first binary num 
		System.out.println("Enter first binary num");
		String binary1=s.next(); 

		//taking input for second binary num 
		System.out.println("Enter second binary num");
		String binary2=s.next(); 

		// Printing the binary nums 
        System.out.println("1st binary number: " + binary1.getValue());
        System.out.println("2nd binary number: " + binary2.getValue());

		// result of functions 
        Binary bitwiseANDResult = Binary.and(binary1, binary2);
        Binary bitwiseORResult = Binary.or(binary1, binary2);

		//
        System.out.println("AND of binary num1/num2: " + bitwiseANDResult.getValue());
        System.out.println("OR of binary num1/num2:" + bitwiseORResult.getValue());


		Binary binary1=new Binary("00010001000");
        System.out.println( "First binary number is "+binary1.getValue());
		Binary binary2=new Binary("111000");
        System.out.println( "Second binary number is "+binary2.getValue());
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "Their summation is  "+sum.getValue());
    }
}
