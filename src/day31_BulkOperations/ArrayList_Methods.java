package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<String> list =new ArrayList<>();
                list.add("A");
                list.add("B");
                list.add("C");
                list.add("D");

                boolean r1 = list.contains("C");
                System.out.println(r1);  //true


        ArrayList<String> list1 =new ArrayList<>();
        list1.add("A");
        list1.add("C");
        list1.add("B");
        list1.add("D");

        boolean r2= list1.equals(list);
        System.out.println(r2);  //false

        Collections.sort(list);
        Collections.sort(list1);

        System.out.println(r2);  //true
        System.out.println("===================================");
        //Arrays.equal(arr1,arr2)

        int[] arr1={1,2,3};
        int [] arr2 ={3,2,1};
        Arrays.sort(arr2);
        Arrays.equals(arr1,arr2) ;  // true

        System.out.println("==============================");

        ArrayList<Integer> list3 = new ArrayList<>();
                    list3.add(10);
                    list3.add(100);
                    list3.add(1000);
                    list3.add(20);
        Collections.sort(list3);
        System.out.println(list3); //[ 10,20,100,1000]

        ArrayList<Integer> reversedlist3 = new ArrayList<>();

                for(int i=list3.size()-1; i>=0; i--){
                  //  System.out.print(  list3.get(i)+" " );  //1000,100,20,10
                      reversedlist3.add(list3.get(i));
                            }
        System.out.println(reversedlist3);

             //   list3= reversedList3;

        System.out.println(list3.size()); // size:4
        list3.clear();// removes everthing, size:0
        boolean r4 = list3.isEmpty();
        System.out.println(r4); //true
    }








}
