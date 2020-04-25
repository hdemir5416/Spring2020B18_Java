package practiceAtHome;
import java.util.Scanner;
public class Scanner_practice {
 public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     System.out.println("enter your age");
     int age = input.nextInt();
     System.out.println("enter your height");
     int height = input.nextInt();

     String result = (age > 10 && height < 100) ? "Come on in" : "Go back";
     System.out.println(result);

     System.out.println("========================================");




     Scanner scan = new Scanner(System.in);
     System.out.println("Enter seconds:");
     int seconds = scan.nextInt();

     String result3=seconds/3600 +" hours," + (seconds%3600)/60 +" minutes,"+
             " and " +  (seconds%3600)%60 +" seconds";
     System.out.println(result3);

 }}











