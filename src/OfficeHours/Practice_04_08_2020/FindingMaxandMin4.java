package OfficeHours.Practice_04_08_2020;
import java.util.Scanner;
public class FindingMaxandMin4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max= -2147483648;

        int i = 1;
        while (i<=3){
            System.out.println("Enter a number");
            int num= input.nextInt();
            if(num>max){
                max = num;
            }

             i++;
    }




    }
}
