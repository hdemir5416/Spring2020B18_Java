package day13_StringClass;
/*
write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102





 */
import java.util.Scanner;

public class ShippinInfo {

    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
        System.out.println("Enter your building number");
        String buildingNum = input.next();  //112A

        input.nextLine(); //Enter

        System.out.println("Enter your street address");
        String streetAddress = input.nextLine();

        System.out.println("Enter your city name:");
        String cityName = input.next();

        System.out.println("Enter your state");
        String stateName= input.nextLine();

        System.out.println("Enter your zip code");
        String zipCode = input.nextLine();

        System.out.println("Enter your full name");
        String fullName= input.nextLine();

        String result = "Ship To:   "+fullName+"\n\t\t"+buildingNum+" "+
                      streetAddress+"  "+stateName+" "+zipCode;





    }



}



