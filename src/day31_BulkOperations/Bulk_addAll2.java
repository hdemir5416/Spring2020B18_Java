package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        // add 30,20,40,50,45,35,200

        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(45);
        list.add(35);
        list.add(200);
//  list.addAll(Arrays.asList(30,20,40,50,45,35,200)

   Integer [] arr ={30,20,40,50,45,35,200}; // not int
   list.addAll(Arrays.asList(arr));
        System.out.println(list);

        System.out.println("=========================");

        String[]names ={"Hilal", "Osman", "Eren","Ekrem","Kerem","Ceren"};
   //                     0         1        2      3        4      5

        ArrayList<String> nameList = new ArrayList<>();

        nameList.addAll(Arrays.asList(names));
                             // collection type

        nameList.add("Ayse");
        nameList.remove("Hilal");
        System.out.println(nameList);

        System.out.println("================================");

        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));

        System.out.println(numList);


    }







}
