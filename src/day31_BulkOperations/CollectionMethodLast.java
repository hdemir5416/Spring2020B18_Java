package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionMethodLast {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        int max = Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);

        /*
        ex;{1,2,3,4,5,6,7,8,8} second max?
        output:7

        ex:{1,1,2,3,4,5,6,7,8,8} second min?
         output:2  */

  ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(1,1,2,3,4,4));
     //second max=0;
     //second min=0;
           Integer maxNum=  Collections.max(numbers);
            numbers.removeAll(Arrays.asList(maxNum)); // if use just remove, it removes one !!!

             int secondmax=Collections.max(numbers);
        System.out.println(secondmax);
        System.out.println("=============================================");

        ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8));

         Integer minnum = Collections.min(list2);
         list2.removeAll(Arrays.asList(minnum));
         int secondmin = Collections.min(list2);
         System.out.println(secondmin);
        System.out.println("==============================================");

        ArrayList<Integer> list3 =new ArrayList<>();
               list3.addAll(Arrays.asList(1,2,3,4,5)); // {1,2,3,4,5}
//                                                         0       4
//           {5,2,3,4,1}
        Collections.swap(list3,0,4);

        System.out.println("===================================");

        ArrayList<String> name = new ArrayList<>();;
         name.addAll(Arrays.asList("hilal","Osman","ahmed","Ekrem","kerem","Ceren","Osman"));

      /*   name.set(0,"Osman");
         name.set(1,"Osman");  */

        Collections.replaceAll(name,"Osman", "Anne");
        System.out.println(name);







    }
}
