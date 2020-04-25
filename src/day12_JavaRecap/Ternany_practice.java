package day12_JavaRecap;
import java.util.Scanner;
public class Ternany_practice {
    public static void main(String[] args) {

        /*
        200, OK
        201,Created
        202, Accepted
         */

        Scanner scan = new Scanner(System.in);
        int statusCode = scan.nextInt();

        String result = " ";

        if(statusCode== 200){
            result = "Ok";
        }else if (statusCode == 201){
        }else if(statusCode ==202){
        }else{
            result = "Invalid status code";
        }

        System.out.println(result);

        String result2= (statusCode== 200)?"Ok" :(statusCode== 201)? "Created":
                (statusCode== 200)? "Accepted": "Invalid" ;

         System.out.println(result2);




    }
}
