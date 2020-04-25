package day24_Methods;

import java.util.Scanner;

/*
1. write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20
	2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, '*') ==> 20;
			calculate(10, 2, '&') ==> Invalid operator
			NOTE: The method MUST take three arguments when it's called
	3. write a method that can identify if a string is palindrome
			ex: palindrom("level")  ==> true
				palindrome("Cybertek") ==> false
 */
public class WarpUp_today {

    public static void Max(int num1,int num2){
    /*    Scanner scan= new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter second number ");
        int num2 = scan.nextInt();  */
        if(num1>num2) {
            System.out.println("max  number is:" + num1);
        }else{
            System.out.println("max number is: "+num2);
        }
    }

    public static void Calculation(double num1, double num2, char operator){

         switch (operator){
             case '+':
                 System.out.println(num1+num2);
                 break;
             case'-':
                 System.out.println((num1-num2));

                 default:
                 System.out.println("invalid");
         }

    }

    public static void palindrome(String str){
        str= str.toLowerCase();
        String reversed ="";
        for(int i=str.length()-1; i>=0 ; i--){
            reversed += str.charAt(i);
        }
        System.out.println(str.equals(reversed));
    }


    public static void main(String[]args){
        int a= 10;
        int b= 20;
        Max(a,b);

    //   Calculation(num1:10,num2:20,operator: '-');
           method("hilal");
          palindrome("hilal");


    }

    public static void method(String name) {

    }

















}
