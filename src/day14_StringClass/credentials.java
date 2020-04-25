package day14_StringClass;
import java.util.Scanner;
public class credentials {
    public static void main(String[] args) {

        /*

userName:Cybertek
passWord:cybertekschool
 */
        String validUserName= "cybertek";
        String validPassWord = "cybertekschool";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");

        String inputUserName = input.next();
        System.out.println("Enter your password:");

        String inputPassWord = input.next();
         boolean validCredential = inputUserName.equals(validUserName)&& inputPassWord.equals(validPassWord);

         if(inputUserName.equals(validUserName)&& inputPassWord.equals(validPassWord)){
            System.out.println("Log in");

         }else{
            System.out.println("Invalid credentials");}



    }


}
