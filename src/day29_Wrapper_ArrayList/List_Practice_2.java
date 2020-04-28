package day29_Wrapper_ArrayList;
import Resourses.Library;

import java.util.ArrayList;
public class List_Practice_2 {
    public static void main(String[] args) {
        /*
       1.create a list of Integers
       2. add 5 Integers to it
       3. return the maximum number from the list

           Do not use any sorting

 */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);

        int max = Integer.MIN_VALUE;
        //       int max= list.get(0);

        for (int i = 0; i < list.size(); i++) {  //i:0,1,2,3,4
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println(max);
        ArrayList<Integer> list2 = new ArrayList<>();
            list.add(500);
            list.add(2000);
            list.add(30000);

          int max3= Library.max(list2);
          System.out.println(max3);



          int max2 = Integer.MIN_VALUE;
          //       int max= list.get(0);

          for (Integer each : list) {  //i:0,1,2,3,4

            if (each > max2) {
                max = each;} }}

         public static int max(ArrayList<Integer>list) {
             int max2 = Integer.MIN_VALUE;

             for (Integer each : list) {  //i:0,1,2,3,4

                 if (each > max2) {
                     max2 = each;
                 }
             }
             return max2;
         }}