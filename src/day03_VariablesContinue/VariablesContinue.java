package day03_VariablesContinue;

public class VariablesContinue {

    public static void main(String[] args){

        boolean result1 = true ;
        boolean result2 = false;

        boolean result3 = 10 > 9; // true
        System.out.println( result3 );

        //System.out.println(true = false );

        System.out.println("Muhtar" == "Good Guy"); // totaly false
        //                 Bad guy == good guy ==> False

        System.out.println("Muhtar"  != "Good Guy");// true
          //                     Bad Guy!= Good Guy == true

        boolean r1 = true != true; // false
        System.out.println( r1 ); //false

        boolean r2 =  "Batch 17" == "Batch 18" ;

        System.out.println("===================================");

        char ch1 = 'A';
        System.out.println(ch1); //A

        char ch2 = 45000;
        System.out.println(ch2);  // one of korean letter

        char ch3 = 25000;
        System.out.println(ch3);  //one of chinese letter

        char ch4 = 100;  // d
        System.out.println(ch4);

        char ch5 = 'D'; // 68
        System.out.println(ch5 );  //D

        int num1 = 'D'; // number
        System.out.println(num1); //68

        char a1 = 'z';
        // byte b1 = a1;   //char is larger than byte

        byte b1 = 'z';

        //short s1 = a1; // char is larger than short

        int i1 = a1; // int is larger than char





    }
}
