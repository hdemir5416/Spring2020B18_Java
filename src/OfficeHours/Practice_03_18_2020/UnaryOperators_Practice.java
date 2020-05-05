package OfficeHours.Practice_03_18_2020;

import java.util.Scanner;

public class UnaryOperators_Practice {

    public static void main(String[] args) {
        // post : first passes the current value, then increase it by 1
        int a = 20;
        System.out.println(a++); //20
        System.out.println(a); //21

        int b = 30;
        int c = b--;  // c = 30,  b= 29;
        System.out.println(b); //29
        System.out.println(c); //30

        int d = 40;
        int e = d++;
        System.out.println(d); // 41
        System.out.println(e); //40

        // pre: changes the value immediately
        int x = 200;
        System.out.println(--x); // 199

        int z = 100;
        z = z++ + --z - z-- + ++z;
     //     = 100 + 100 - 100 +100; // 200

        int  u = 900; //901 //902
        int r = - ++u + ++u + -u++;
     //         = - 901 + 902 + -902 //-901


        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.substring(0,2).equals("ja") || word.substring(1,3).equals("ja"))
        {System.out.println("true");}
        else{
            System.out.println("false");}
    }

    }
