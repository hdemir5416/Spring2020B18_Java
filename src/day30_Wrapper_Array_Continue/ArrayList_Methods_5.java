package day30_Wrapper_Array_Continue;

import java.util.ArrayList;

public class ArrayList_Methods_5 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 =new ArrayList<>();
         list1.add(5); //0
         list1.add(7); //1
         list1.add(8); //2

         list1.add(1,6);  //{5,6,7,8}
         list1.add(7,10);  //index out of bound

        list1.set(3,9);

        System.out.println(list1);

        int[]arr={1,2,3,4}; //{1,2,3,4,5}
        arr[3]= 5;

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add(1,"C");
        list2.add(1,"D");
        //{A,D,C,B}

        list2.set(3,"F");//  A D C F
        list2.set(2,"E");  // A D E F
        System.out.println(list2); //{A,D,E,F}
        System.out.println("=======================================");

        ArrayList<Integer> list3 = new ArrayList<>();
            list3.add(1);  //0
            list3.add(2);  //1
            list3.add(3);  //2
            list3.add(4);  // 3

       //{1,2,3,4}
          int a= 1;
         list3.remove(1);//   {2,3,4}

        //{1,2,3,4}
        Integer  b=1;
        list3.remove(b); //{2,3,4}

        ArrayList<Integer> list4 = new ArrayList<>();
               list4.add(10);
               list4.add(20);
               list4.add(30);
          // {10,20,30}
         //   0  1  2
        list4.remove(2);  //{10,20}
        Integer a2=20;
        boolean r= list4.remove(a2);  // true
        list4.remove(20);  //{10,30}





    }
}
