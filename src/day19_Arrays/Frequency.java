package day19_Arrays;
/*


         write a program that can return the frequency of the characters ina string
		Ex: "AABCBCA" ==> "A3B2C2"
               	Hint: You need nested loops
 */
public class Frequency {
    public static void main(String[] args) {

             String str = "AABCC";       //A2B1C2
             String result = "";   //A2B1C2

              String nonDup= "";  //ABC

      //        int count = 0;           //  count the total number of occurence of each character from str

             for( int i=0; i<=str.length()-1; i++) {
                 if (!nonDup.contains("" + str.charAt(i))) { //if character at index i isnt contained in nonDup,
                     nonDup+= str.charAt(i);
                 }

             }
                    //   System.out.println(nonDup);





    }
}
