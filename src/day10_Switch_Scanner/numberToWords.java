package day10_Switch_Scanner;

public class numberToWords {
  /*

 write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
				DO NOT USE IF STATEMENTS
*/

    public static void main(String[] args) {


        int num = 5;


        if (num > 0 && num < 9) {

            String word = (num == 0) ? "zero" : (num == 1) ? "one" : (num == 2) ? "two" : (num == 3) ? "three" : (num == 4) ? "four" :
                    (num == 5) ? "five" : (num == 6) ? "six" : (num == 7) ? "seven" : (num == 8) ? "eight" : (num==9)?"nine":"invalid";


           System.out.println(word);

        }
    }
}