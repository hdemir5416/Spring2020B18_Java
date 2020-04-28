package day30_Wrapper_Array_Continue;

import java.util.ArrayList;

public class ArrayList_Methods_6 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
                list.add("A");
                list.add("B");
                list.add("C");

             //   list.remove(1);
            boolean f= list.remove("A");//true

            String str="B";
            boolean r= list.remove(str);  //true {A,C}
            System.out.println(list);

            list.clear();
          System.out.println(list);
          System.out.println();
    }
}
