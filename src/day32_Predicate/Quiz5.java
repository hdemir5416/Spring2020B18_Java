package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz5 {

    /*
      1-remove all the special characters from a list of Character
      2- remove all the numbers that can divisible by 3 or 5 in arrayList
     */
    public static void main(String[] args) {

       // 5,9,10



        ArrayList<Integer> disible15 = new ArrayList<>(Arrays.asList(1,5,10,15,67,5,6));
          disible15.removeIf(x -> x %3==0 || x%5 ==0);
        System.out.println(disible15);

    }







}
