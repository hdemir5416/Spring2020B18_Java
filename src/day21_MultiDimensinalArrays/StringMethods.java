package day21_MultiDimensinalArrays;
import java.util.*;
public class StringMethods {
    public static void main(String[] args) {
        String name = "Java"; // 'j'  'a' ......

        char[] chars = name.toCharArray();

        System.out.println(chars[0]); // 'j'
        System.out.println(chars[3]);  // 'a'
        //   System.out.println(chars[4]);  out of bound

        String str = "i like Java";

        String[] arr = str.split("");

       System.out.println(Arrays.toString(arr));

         String sentence = "Today is great day";
          String []words=  sentence.split("");

        System.out.println(Arrays.toString(words));// [today, is, great, day ]
        String result = "";

        for(int i =words.length-1;i>=0; i--) {
            String eachwords = words[i];
            //   System.out.println(eachwords+" ");
            //    result += eachword+"";


        }
    }
}
