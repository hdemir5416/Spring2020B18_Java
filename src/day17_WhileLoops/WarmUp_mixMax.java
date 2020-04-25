package day17_WhileLoops;
import java.util.Scanner;
public class WarmUp_mixMax {

 /*

1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
	2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement

  */
 public static void main(String[] args) {
               Scanner input = new Scanner(System.in);
               int MaxNumber = -2147483647; //any number theuser provided will be gretaer than its number
           // first user entered variable will be initalized to maxnumber
              //maxnumber= 1,3,-2, 0, 0

           int MinNumber = 2147483647;

           // min = 0,

           for(int i=1; i<6; i++){
              System.out.println("Enter a number" );
               int num = input.nextInt();  //1,3,-2, 0 , 0

                if(num>MaxNumber){  //to compare each user input, and assign maxnum to Maxnum
                    MaxNumber = num;}

                if(num<MinNumber) {//to compare each user input, and assign  minnum to Minnum
                    MinNumber = num;

                }
               System.out.println(MaxNumber);
               System.out.println(MinNumber);

            }



 }
}