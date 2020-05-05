package day32_Predicate;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates2_3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));

        ArrayList<String> result = new ArrayList();

        for(int i=0; i<list.size(); i++) {

            int count = Collections.frequency(list, list.get(0));
            if (count > 1 && !result.contains(list.get(i))) {
                result.add(list.get(0));
        }
          }
        System.out.println(result);
    /*     int  count =Collections.frequency(list,list.get(0));
         if(count>1){
             result.add(each);                 */}





    }

