package day17_WhileLoops;
import java.util.Scanner;
public class WhileLoopPractice {
    public static void main(String[] args) {
        /* ask the user yes or no.
        if  the user enter other than yes or no, repeat the perivous question
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Enter yes or no");
        String word = input.next();
        boolean valid =word.equalsIgnoreCase("Yes") || word.equalsIgnoreCase("no");

        if(!valid){
        System.out.println("please re-enter");}

          if(word.equals("yes")){
            System.out.println("Entered yes"); }


        if (word.equals("no")){
               System.out.println("Entered no"); }



    }
}
