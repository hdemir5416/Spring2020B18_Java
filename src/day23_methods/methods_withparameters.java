package day23_methods;
import java.util.Scanner;
public class methods_withparameters {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        EligibleToBuyAlcohol(45);
    }
// we can switch byte age with explicitng casting  (byte)45

    public static void EligibleToBuyAlcohol(int age ){

        if(age>=21) {
            System.out.println("Eligible to by alcohol");

        }else {
            System.out.println("eligible to buy milk");


        }


    }
}
