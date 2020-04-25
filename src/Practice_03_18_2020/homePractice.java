package Practice_03_18_2020;
import java.util.*;

public class homePractice {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if ((a + b + c) == 180) {
            System.out.println("a triangle is valid");
        }

        if ((a + b + c) != 180) {
            System.out.println("a triangle is not valid");
        }

        System.out.println("===========================");


        int i = 0;
        while (i <= 5) {
            System.out.println("Sibel");
            i++;
            if (i == 2){
                break;}



        }
    }
}