package day10_Switch_Scanner;
import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*

 write a program for the rate calculater: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
 */
        System.out.println("Enter salary");
              int salary = scan.nextInt();
        System.out.println("How many week do you work in a year");
              byte weeklyHours= scan.nextByte();
        System.out.println("How many hours do you work per week?");
               byte hourlyRate = scan.nextByte();
       // System.out.println("Your hourly rate is: $"+hourlyRate);



    }}
