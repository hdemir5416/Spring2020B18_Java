package day30_Wrapper_Array_Continue;

import java.util.ArrayList;

public class Uniques_warm3 {
    public static void main(String[] args) {
   /*
        3. write a program that can print out the unique elements from an ArrayList of
		   HINT: store all the unique elements of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}     */

      ArrayList<Integer> list = new ArrayList<>();  //1,2,1
              list.add(1);
              list.add(2);
              list.add(1);

      ArrayList<Integer> uniques = new ArrayList<>();

       for(int i=0; i<3;i++) {

           // list.get(0) ==>1
           int count = 0;
           for (Integer each : list) {

               if (each == list.get(i)) {
                   count++; }}
           if (count == 1) {
               uniques.add(list.get(i)); //0 1 2   }
               // }

 }           System.out.println(uniques);}}}
