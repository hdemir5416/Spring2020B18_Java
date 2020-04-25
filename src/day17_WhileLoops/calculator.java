package day17_WhileLoops;
import java.util.Scanner;

/*
	4.	write a program that can calculate the two numbers based on the user provided operators, the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
								(assume that only the +, -, *, /, and % will be entered)
						then the system will give the result based on the operator
						at the end it will ask if the user want's to calculate another numbers, if user
						entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
								(you will need a lop that has true condition without the iterator)
 */
public class calculator{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        System.out.println("Math operator");
        String operator = input.next();  // +, - , *, /
/// char operator = input.next().charAt(0)
 //  operator == '+'
        if (operator.equals("+")) {
            System.out.println("Additon is: " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("Substraction: " + (num1 - num2));
            {

            }

/*
String result=(operator.equals("+"))? "Addition is: "+(num1+num2):
        (operator.equals("-"))? "Subtraction is: "+(num1-num2):
                (operator.equals("*"))?"Multiplications is: "+(num1*num2):
                        (operator.equals("/"))?"Division is:"+(num1/num2):
                                operator.equals("%")?"Remainder is:"+(num1%num2):"invalid operator"; */

        }}}