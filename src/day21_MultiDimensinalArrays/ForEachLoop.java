package day21_MultiDimensinalArrays;
import java.util.*;
public class ForEachLoop {
    /*
    for(Datatype variable : ArrayName){

    }
     */

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        for (int eachElement : nums) {
            System.out.println(eachElement);
        }

        String[] students = {"Hilal", "Osman", "Eren"};
        for (String eachStudent : students) {
            System.out.println(eachStudent);
        }
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int each : arr1) {
            if (each < 5) {
                continue;
            }
            System.out.println(each);

            System.out.println("================================");

  /*          String sentence = "I like Java"; //Java like I

            String words = sentence.split(" ");  //[ I, like , java ]

            for (String eachWord : words) {   // 0~2


            }
        System.out.println("==============================");

        for(int i =words.length-1; i>=0; i-- ){
           System.out.println(words[i]) ;

   */
        }
    }
}