package day23_methods;
/*

	1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */
public class warmup_1 {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "A"};  //B

        for (String each : arr) { // 3: A  B  C

            int count2 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("A")) {
                    count2++;
                }
            }

            if (count2 == 1) {
                System.out.println(each);


            }
            System.out.println("==========================================");

            //solution2:
            for (String each2 : arr) {       //3:A,B,C


                int count = 0;
                for (String each1 : arr) {

                    if (each1.equals(each2)) {
                        count++;
                    }
                }
                if (count == 1) {  //if the character is unique
                    System.out.println("A");
                }


            }
/*
             String str = "AAABBCC"==>A3B2C2
             [A,A,A,B,B,C,C]
  */

        }


    }}

