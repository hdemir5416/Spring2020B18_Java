package day30_Wrapper_Array_Continue;

import java.util.ArrayList;

public class ArrayLisrReverse_warm2 {
    /*

    2. write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
     */
    public static void main(String[] args) {
//reversedList.add(list.get(i));
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<6; i++){
            list.add(i);}
        System.out.println(list);
      ArrayList<Integer> reversedList  = new ArrayList<>();

        for(int i =list.size()-1; i>=0;i--){
            int eachNum = list.get(i);
           reversedList.add(eachNum);
           //reversedList.add(list.get(i));
        }System.out.println(reversedList);
        System.out.println("======================================");
        // ArrayList=> {1,2,3,4,5}

        ArrayList<Integer> list2 =new ArrayList<>();

        for(int i=1 ; i<6;i++){
            list2.add(i);
        }
          ArrayList<Integer>reversed = new ArrayList<>();
                for(int i=list2.size(); i>0; i--){
                    reversed.add(i);
                }

        System.out.println(reversed);
        System.out.println(" =========================="   );
        System.out.println("===================================");
       // list=> {1,2,3,4,5}
      //  output: 5 4 3 2 1
                ArrayList<Integer> list3= new ArrayList<>();
                for(int i=0; i<6; i++){
                    list3.add(i);
                }
                ArrayList<Integer> reversedd = new ArrayList<>();
                for(int i=list3.size(); i>0; i-- ){
                    reversedd.add(i);
                }







 }}

