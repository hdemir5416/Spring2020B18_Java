package day04_JavaRecap;

public class Variable_Practice {

    public static void main (String [] args){
        //DataType variableName = Data;

        byte num1 = 127;
        short num2 = num1; //double>float>long > int> short> byte
       // byte num3 = num2;

        int num4 = num2;  // ont is prefered by compiler


        long num5 = 99999999L;

        float num6 = 100L;
        System.out.println(num6); // 100.0
        //1. 100, 2. 100L ,     3. 100.0

        float num7 = 0.5f;
        System.out.println(num7); // 0.5

        double num8 = 0.5f;
        double num9 = 999999L;
        double num10 = 100.5;

        System.out.println(num10);

        char ch1 = '$'; //every single character has a corresponding number
        System.out.println(ch1); // $

        char ch2 = 22000;
        System.out.println(ch2); //chinesse letter

        char ch4 = 60000; // 0~ 65565
        System.out.println(ch2); //it gives character not number

        int a1 = '8'; // 8 cannot be 10 cause SINGLE character is used

        System.out.println(a1); // 56

        int a2 = 'z';
        System.out.println( a2 ); //122

        double d1 = 'z'+ '8';  //z8, 178,  178.0 //decimal should be

        char ch3 = 178;
        System.out.println(ch3); //some character

        char ch5 = 'z'+ '8';
        System.out.println(ch4); //same character with the uppur

        boolean bool1 = true ;
        boolean bool2 = false;

        System.out.println(9>10); //false
        System.out.println(9>=10); // true
        System.out.println(9!=10); // true
        System.out.println('a'== 'b');// false

        //  System.out.println('a'== "a"); // '' does not match ""

        System.out.println('a'== 'b' -1 );
        //  97== 98-1 ==> true

        System.out.println("Muhtar" =="Good Guy"); // false
        //                 Muhtar == Good Guy ==> false

        System.out.println("Muhtar" != "Good Guy");  // true

        System.out.println("Muhtar" == "muhtar"); //false

        //System.out.println("Cybertek" == 1000);

        boolean r1  = !true; // false
        System.out.println(r1); //false
        System.out.println(!r1); //true
        System.out.println(!true == false); //true
        System.out.println( !true != !false); //true


    }
}
