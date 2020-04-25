package day13_StringClass;
/*
     input: cyBerTek sChool
     output: Cybertek
             School

 */
import java.util.Scanner;

public class StringManipulation_Practice {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName= input.nextLine();  //cybertek school

        String firstName= fullName.substring(0,8).substring(fullName.indexOf(" "));
        String lastName= fullName.substring(fullName.indexOf(" ")+1  );

        System.out.println("your first name is "+firstName);
        System.out.println("your last name is "+lastName);
    }



}

