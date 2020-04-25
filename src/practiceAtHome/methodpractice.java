package practiceAtHome;

import java.util.Scanner;

public class methodpractice {

          public static void Max(int a,int b){

            if (b > a) {
                System.out.println("max is:" + b);
            } else {
                System.out.println("min is:" + a);
            }

            int d = 10;
            int q = 100;
            Max(d,q);




        }

            public static void Calculation(int a,int b){
                Scanner scan = new Scanner(System.in);
                System.out.println("enter number");
                int k = scan.nextInt();
                System.out.println("enter number");
                int l = scan.nextInt();
                System.out.println("operator");
                String  v= scan.next();

                System.out.println(a+v+b);

    }




        public static void main(String[] args) {


    }
}
