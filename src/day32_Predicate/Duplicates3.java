package day32_Predicate;
/*
write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]  */

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates3 {
    public static void main(String[] args) {

        ArrayList<String> list = new  ArrayList<>();
        list.addAll(Arrays.asList("A","B", "A","C","D"));
        System.out.println(list);

        ArrayList<String>duplicates = new ArrayList<>();

       for(int i=0; i<list.size(); i++){
           int count =0;
           for(String each:list){
               if(each.equals(list.get(i))){
                   count++;
               }}

           if(count>1 &&!duplicates.contains(list.get(i))){
//the frequrncy is greater that 1, it is not contain in duplicates yet, add the
               duplicates.add(list.get(i));
       }






           }







    }
}
