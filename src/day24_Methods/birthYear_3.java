package day24_Methods;

import java.util.Scanner;

public class birthYear_3 {
    public static void Age(int birthYear){
         Scanner scan = new Scanner(System.in);
        int currentYear = 2020;
        int age = currentYear -birthYear;

        if(age>0 && birthYear>1900){
            System.out.println(age);
        }else{
            System.out.println("invalid birth year");
        }


    }

    public static void main(String[] args) {

     //   int a= 2020;
      //  Age(2002);
    }

    public static void printHello() {
        System.out.println("Hello");

    }

    public static void printCybertek() {
        System.out.println("Cybertek");
    }

    public static void printHelloCybertek() {
        printHello(); //Hello
        printCybertek(); //Cybertek
    }



}
