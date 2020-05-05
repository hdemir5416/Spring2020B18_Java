package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

             list.add(10);
             list.add(20);
             list.add(1,30);
             list.get(2);  //Integer 20
        System.out.println(list.get(2));

        int  a= 100;
        Integer b= a;

        Byte a2=45;
        int b2= a2;  //unboxing

        ArrayList<String> list2 = new ArrayList<>();
             list2.add("A");
             list2.add("B");
             list2.add("C");
             list2.add("D");  // ABCD

        for(int i=0; i<list2.size(); i++){
           String str =  list2.get(i);
            System.out.println(str);
        }

        System.out.println("============================");

         for(String each:list2){ //each of elements ABCD
             System.out.println(each);

             // A B C D  ==>ABECD ==> A B C
        //      0 1 2 3
             //     list2.add(2,"E");
             //   list2.get(3);
             System.out.println("=========================");

          //   list3: {A,B,C,D}
    //    boolean r1= list3.remove("A"); B C D  //true
    //     booelan r1= list3.remove("Z");   // false











    }

}}
