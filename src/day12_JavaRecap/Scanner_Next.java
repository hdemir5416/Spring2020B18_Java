package day12_JavaRecap;
import java.util.Scanner;
public class Scanner_Next {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //   String str = scan.next();

      //     System.out.println();// next () only takes first word

         //7921 Jones Branch Dr, McLean VA, 22034
               String fullAddress="";

                System.out.println("Enter the number of the building:");

                short Bnumber= scan.nextShort();
                fullAddress += Bnumber+" "; //fullAdress = fullAddress+Bnumber+" "

                System.out.println("Enter thre Street NAme: ");
                String streetName= scan.next();
                fullAddress += streetName+ " ";

                System.out.println("Enter the type of the road");
                String roadType = scan.next();
                fullAddress += roadType+" ,";

                System.out.println("Enter city name, state,zipcode");
                String cityName = scan.next();
                fullAddress += cityName+ " ";

                String state = scan.next();
                fullAddress +=state+" '";

                String  zipCode = scan.next();
                fullAddress +=zipCode;
        System.out.println("Address is: "+ fullAddress);

    }
}
