package day20_ArrayContinue;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.*;
public class StringMethods {
    public static void main(String[] args) {

        /*String name = "Hilal";

          char[]character =  name.toCharArray();

        System.out.println(Arrays.toString(character));

        String str1 = "Cybertek School";
        String str2 = "School Cybertek";

        char[] ch1 = str1.toCharArray(); // c,y,b,e,r,t,e,k, , s,c,h,o,o,l,
        char[] ch2 = str2.toCharArray();// s,c,h,o,o,l,,c,y,b,e,r,t,e,k

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean equalStr = Arrays.equals(ch1, ch2);

        System.out.println(equalStr); // str1& str2 are build out of the same characters*/

        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String temp = "";

        for (int i = a.length()/2-1; i >=0 ; i-- ){


            temp += a.substring(i, i+1);

        }

        if(temp.length()%2==0 && temp.equals(a.substring(a.length()/2+1))){

            System.out.println("ph");
        }

        else if(temp.length()%2==1 && temp.equals(a.substring(a.length()/2))){

            System.out.println("ph");
        }
        else{
            System.out.println("not ph");
        }


















    }
}
