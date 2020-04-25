package day20_ArrayContinue;
import java.util.Scanner;
public class Months {
    public static void main(String[] args) {
        String[] months={"January ","February ","March ","April ","May ","June ",
 "July ","August ","September ","October ", "November ","December "}; //size:12

    /*    String[] months2 = new String[12];
                 months[0]="January";   ....      */

            Scanner scan = new Scanner (System.in);
            System.out.println("enter a num:");
            int num = scan.nextInt();

            int attepmts = 0;
            while(num>12 ||num<=0){
                System.out.println("Invalid Entry");
                System.out.println("Please re-enter ");
                num= scan.nextInt();}
                attepmts++;

              if(attepmts==3 && (num>12 || num<=0) ){
                  System.out.println("invalid, you entered 3 times");
                  System.exit(0);
              }

            String result =months[num-1];   //index number
            System.out.println(result);

        }
    }

