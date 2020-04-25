package day12_JavaRecap;
import java.util.Scanner;
public class Scanner_Nextline_practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //7921 JonesBranch DR,McLEan VA, 22034
        //fullAddress : Building-number Street, City, state zipcode
        System.out.println("Builder NUmber: ");
        int Bnumber = input.nextInt();

        System.out.println("BUilding number is"+Bnumber);

        input.nextLine();   // used for taking out the enter from scanner
        System.out.println("Street: ");
        String street = input.nextLine();



        System.out.println("Enter the zip code: ");
        int zipCode = input.nextInt();  //22034Enter

        input.nextLine(); //take out the enter

        System.out.println(" Enter the city name and state seperated by comma and space");
        String cityState = input.nextLine();
        String fullAddress = Bnumber +" "+street+ " ,\n"+cityState+ " "+zipCode;

        input.close(); // closes the scanner
        System.out.println("Enter month number:");



    }
}
