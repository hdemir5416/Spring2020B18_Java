package day12_JavaRecap;
import java.util.Scanner;
public class SumOfFiveNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five numbers");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        double num5 = input.nextDouble();

        double sum = 0;

        if (num1 > 0) {
            sum += num1;
        }
        if (num2 > 0) {
            sum += num2;
        }
        if (num3 > 0) {
            sum += num3;
        }
        if (num4 > 0) {
            sum += num4;
        }
        if (num5 > 0) {
            sum += num5;
        }
        System.out.println("sum of positive 5 number:"+sum);
        /*
        write a program that asks to enter 5numbers and prints the numbers in ascending order
             ex:
             5,4,1,3,2

             output:
             1,2,3,4,5

            */
    }
}