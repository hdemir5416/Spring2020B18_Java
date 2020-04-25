package day10_Switch_Scanner;

public class warmUp {

/*
2. write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF

 */

    public static void main(String[] args) {

        int num= 3;
        String result = "";
        String result2= "";

        if(num>=1 && num<=7) {

            if (num == 1) {
                result = "monday";
            } else if (num == 2) {
                result = "tuesday";
            } else if (num == 3) {
                result = "wednesday";
            } else if (num == 4) {
                result = "thursday";
            } else if (num == 5) {
                result = "friday";
            } else if (num == 6) {
                result = "saturday";
            } else {
                result = "sunday";
            }

        } else { result= "invalid";
                System.out.println(result);



            }


       /*

        String result2= "";
       result = (num==1)?"monday" :(num==2)? ""..........
        }else {
            System.out.println("Invalid");       */








       }







        }















