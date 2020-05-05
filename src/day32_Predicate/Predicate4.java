package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Predicate4 {
    public static void main(String[] args) {
        Character[] chars = {'A', 'B', 'C', 'D', 'D'};
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));
        System.out.println(charList);

        ArrayList<Character> result = new ArrayList<>();

        for (int i = 0; i < charList.size(); i++) {
            int count = Collections.frequency(charList, charList.get(0));
            if (count == 1) {
                result.add(charList.get(0));
            }

        }


   /*     for (int i = 0; i < charList.size(); i++) {
            int count = Collections.frequency(charList, charList.get(0));
            if (count == 1) {
                result.add(charList.get(0));
            }

        }
        System.out.println(result);*/

           for(Character each:charList){
               int count = Collections.frequency(charList, each);
               if(count ==1){
                   result.add(each);
               }
           }


    }
}