package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class warmUp2_Moves2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,0,20,0,30,0,40,0,0,0));
        System.out.println(list);
       int count = Collections.frequency(list,0);
        System.out.println(count);

        list.removeAll(Arrays.asList(0));
        System.out.println(list);  // [10,20,30,40]
         for(int i=0; i<count; i++){
             list.add(0);
         }









}}
