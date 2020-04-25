package day17_WhileLoops;
import java.util.Scanner;
public class credentials {
/*
    user: cybertek
    pass: cybertek123

*/
          public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              System.out.println("Enter username");
              String username = input.next();

              System.out.println("Enter password");
              String password = input.next();

              while (!username.equals("cybertek") && !password.equals("cybertek123")){
                  System.out.println("please re enter your credentials");
              System.out.println("Enter user name");
              username = input.next();
              System.out.println("Enter pass word");
              password = input.next();}

              {   System.out.println("Loggod in");}



    }
}
