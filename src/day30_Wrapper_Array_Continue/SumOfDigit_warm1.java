package day30_Wrapper_Array_Continue;
/*
1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits
*/
public class SumOfDigit_warm1 {
    public static void main(String[] args) {

        String a = "a1b2c3";
        char[] b = a.toCharArray(); //a1b2c3

        int sum = 0; //will contain sum of all digits
        for (char each : b) {

            //         if(each >=48 && each<=57 ){  // if each is digit
            //            sum+=Integer.parseInt(""+each); //"0"

            if (Character.isDigit(each)) { // idDigit(): if the given character is digit
                sum += Integer.parseInt("" + each); //"0"  }
            }
            System.out.println(sum);
//        Character.isAlphabetic('A'): identify if the char is aplhbet
        }

    }}
