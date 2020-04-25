package practiceAtHome;

import java.util.*;

public class carReturn {

    public static void main(String[] args) {
        Scanner hilal = new Scanner(System.in);

        /*int vehicleYear = 2015;
        System.out.println("Enter vehicle's year:" + vehicleYear);


        if ((vehicleYear >= 1995 && vehicleYear <= 1998) || (vehicleYear >= 2001 && vehicleYear <= 2002) || (vehicleYear >= 2004 && vehicleYear <= 2006) || (vehicleYear >= 2015 && vehicleYear <= 2017)) {

            System.out.println("Your vehicle needs to be recalled!");
        } else {
            System.out.println("Your vehicle is fine, enjoy!");
        }

        System.out.println("============================");*/

        System.out.println("input your first number now.");
        int num1 = hilal.nextInt();
        System.out.println("input your second number now.");
        int num2 = hilal.nextInt();
        System.out.println("input your last number now.");
        int num3 = hilal.nextInt();

        System.out.println("============================");

        if (num1 > num2 && num1 > num3) {
            System.out.println("the greatest:" + num1);
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("the greatest:" + num2);
        } else {
            System.out.println("the greatest:" + num3);

            System.out.println("=============================");

            int sunday = 1;
            int monday = 2;
            int tuesday = 3;
            int wednesday = 4;
            int thursday = 5;
            int friday = 6;
            int saturday = 7;
            String dayWeek = "";

            if (sunday==1 ) {
                System.out.println("sunday");
            } else if (monday == 2) {
                System.out.println("monday");
            } else if (tuesday == 3) {
                System.out.println("tuesday");
            } else if (wednesday == 4) {
                System.out.println("wednesyday");
            } else if (thursday == 5) {
                System.out.println("thursday");
            } else if(friday==6){
                System.out.println("friday");
            }else
                System.out.println("saturday");
            }

    }


}






    /*

                if(y>0){int x = 1;}
           */

                    /*double score= 0.0;
                            if(score>80 && score<90){
                                score+=5;
                            }*/
                    /*item = ((i>=10) && (i < 50))*/

                /*  if(x%2==1 && x>0){
                System.out.println("true");
                 */

                /* if( x>0 && y>0){
                System.out.println("true");
                 */

                /*
                if( (x>0 && y>0) || (x<0 && y<0) ){
                  System.out.println(true);
                 */
















