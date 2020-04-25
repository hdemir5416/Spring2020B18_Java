package day18_nestedLoops;
/*

warmup tasks:
	1. write a program that can divide two numbers.

			10/3 =3 reminder 1
			10-3-3-3= 1
			a= a-b= 7
			a= a-b= 4
			a= a-b=1


			NOTE: DO NOT USE division, multiplication, or module operators
	2. write a program that can return the factorial number of any given number
                     5! = 5.4. 3.2.1=120
 */
import java.util.Scanner;
public class warmUpTask {
    public static void main(String[] args) {

        int a = 15;
        int b = 3;
        if(b==0) {
            System.out.println("b can not be zero");
            System.exit(0);
            int count = 0; //count the execution of the loop

            while (a >= b) {
                a -= b;
                count++;
            }
            if (a == 0)
                System.out.println("The result is " + count);
            else {
                System.out.println("the result is " + count + "with a resinder of");
            }

            System.out.println("====================");


            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number ");
            int num = scan.nextInt();
            int result = 0;
            while (num >= 1) {

                result= result *=num; //result *=num;

                num--;

            }


        }}}








