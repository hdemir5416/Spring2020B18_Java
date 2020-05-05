package day31_BulkOperations;



import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
         list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,8,1,3,3,3,3));
         // remove 1,3,5,8

  /*    Integer a = 1;
        list.remove(a);
        list.remove(a);
        System.out.println(list); // 2,4,5,6

      Integer b= 3;
        list.remove(b);
        list.remove(b);

   */
     //  list.removeAll(Arrays.asList(3,1))
       Integer[] arr ={3,1,5,8};
        list.removeAll(Arrays.asList(arr));
        list.removeAll(Arrays.asList(3));
        System.out.println(list);


        System.out.println("=================================");

       String[] names ={"Ahmed","Ahmed","Ali","Osman","Hilal"};

       ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));

       nameList.removeAll(Arrays.asList("Ahmed"));
           System.out.println(nameList);
         /*

write a program remove duplicates from an arrayList */


    }}