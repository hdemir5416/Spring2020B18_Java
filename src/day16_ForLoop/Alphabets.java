package day16_ForLoop;

public class Alphabets {
    public static void main(String[] args) {
 /*       int A = 65;
        int a = 97;
        for (int i = 0; i< 26; i++) {
            System.out.print((char)(A+i)+""+ (char)(a+i) + "\t");
 */

    String upperCase= ""; //A-Z
        String lowerCase = ""; //a-z
        for(char ch= 'A'; ch<='Z'; ch++){
            upperCase += ch;
        }
        System.out.println(upperCase);

        for(char ch= 'a'; ch<='z'; ch++){
            lowerCase += ch;
        }
        System.out.println(lowerCase);
        /// Aa Bb Cc Dd
       String result= "";

        for( int i=0; i<=upperCase.length()-1;i++){
            result += upperCase.charAt(i) + "" + lowerCase.charAt(i)+" " ;
        }
        System.out.println(result); //Aa Bb
        System.out.println('a'+""+ 'b');
        //second solution
        int a=97;
        int A = 65;


       String result2= "";
        for( int i =0; i<=26; i++){
           char ch  = (char)(A + i); //uppercase
        //                     65
          char ch2= (char)(a+i);
         //                97+0
            result +=ch + ""+ch2+ " ";

            System.out.println(ch);



        }

        /*

      f or (char i = 'A'; i <= 'Z'; i++ ) {
    System.out.print(("" + i) + Character.toLowerCase(i) + " | ");*/



/*for(int i =97 ; i <= 122; i++ ){ // lowercase Alphabet
    char ch1= (char)+i;
    System.out.print(ch1+" ");
}
System.out.println();
// A = 65  ==> Z= 90
for(int i =65 ; i <= 90; i++ ) {// uppercase
    char ch2 = (char) +i;
    System.out.print(ch2+" ");*/
}

    }

