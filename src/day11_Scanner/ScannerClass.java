package day11_Scanner;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
      //   int  a = 999999999L; //long(2.5) //2
         System.out.println("Enter a long number: ");
           long a= input.nextLong();
        System.out.println("You have entered: "+a);

        System.out.println("Enter a decimal: ");

        double  b = input.nextFloat(); // float can be assigned to double
        long c = (long)input.nextFloat();
        System.out.println("You have entered: "+b);

        System.out.println("Enter true or false");
           boolean f = input.nextBoolean();
        System.out.println(f);

        System.out.println("Enter your sentence:");
        String str = input.next();

        System.out.println("you have entered: "+str);

    }
}
