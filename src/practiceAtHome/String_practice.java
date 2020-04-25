package practiceAtHome;

import java.util.Scanner;

public class String_practice {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.println("enter your name");
      String name = input.nextLine();
      System.out.println("enter last name");
      String lastName = input.nextLine();

      String a = name.substring(0, 1).toUpperCase();
      String b = lastName.substring(0, 1).toUpperCase();
      String result = a + b;
      System.out.println(result);
       //String intials = ""+firstName.charAt(0)+lastName.charAt(0)........
      //  Java avaJ
      String s = "";
      String v = input.nextLine();
      String m = v.substring(1).toLowerCase() + (v.substring(0, 1));
      System.out.println(m);

      System.out.println("=====================");}}

