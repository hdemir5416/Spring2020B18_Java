package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();
         list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // if 10,20,60,80,90,100,200,300 all abjects are exit in arraylist ==>true

    /*     boolean r1 = list.contains(10);
        boolean r2= list.contains(20);
        boolean r3 = list.contains(60);

        boolean result = r1 == true && r2 == true && r3 == true;

        System.out.println(result); */


      boolean result = list.containsAll(Arrays.asList(40,20,10));
        System.out.println(result);  //true

 //      10,30,40
         Integer[] data = {10,30,40}; // not works int cause Integer object

     boolean result3 = list.containsAll(Arrays.asList(data));
        System.out.println(result3);  //true

 //      list.containsAll(1,2,3,4,5)
    }
}
