package day19_Arrays;

public class Array_Practice2 {
    public static void main(String[] args) {

        int[] arr= {10, 20,30};
        System.out.println(arr.length); //3

        int[]arr2 = new int[5];
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

         String[ ]testers= new String [3]; // {"Reem", "Madina", "Osman"]
                          //  index: 0 1 2
         testers [0] = "Reem";
         testers [2]  = "Osman";
          testers[1] = "Medine";

        System.out.println(testers[0]);  // Reem
         System.out.println(testers[1]); // Medine
         System.out.println(testers[2]);  // Osman

        System.out.println(testers.length); // 3

        System.out.println("==========================================");

           String [] students = new String [10];
            // write a program that asks "enter a name" 10 times, and store each of the names in the array students




    }
}
