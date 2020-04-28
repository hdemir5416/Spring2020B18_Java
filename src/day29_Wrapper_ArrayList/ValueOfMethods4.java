package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethods4 {
    public static void main(String[] args) {


        String a= "123";

        Integer b =Integer.valueOf(a); //Integer, 123

       double b1=Integer.valueOf(a);
        System.out.println(b1);  //123.0

        String str2= "15.5";
        double d1= Double.parseDouble(str2);  //15.5 primitive  double==double // none

        double d2=Double.valueOf(str2);  //15.5  double==Double  // unboxing

        System.out.println(d1==d2);  //true

        String b5= "12345";
        Integer b6= Integer.parseInt(b5);
           System.out.println(b6);

           String f3="567";
           int f4 =Integer.valueOf(f3);



        System.out.println("======================================================");


        int a1=2000;
     //   Long LP = a1; does not accept other primitives expect for long

        Short sh1= 3000;
        int a4 =(short)sh1;
        /*
        "TRue"
        "FalsE" ==>to boolean
        "1000000000.5 ==>double
         */

        String  b3= "TRue";

        boolean g=Boolean.parseBoolean(b3); // true  boolean ==Boolean
        System.out.println(g);
        Boolean g1 =Boolean.valueOf(b3);  //true  Boolean==Boolean
        System.out.println(g1);

        String t= "10000000.5" ;
        Double t2 =Double.parseDouble(t); //1.00000005E7  Double
        System.out.println(t2);
        double t3 =Double.valueOf(t);  //1.00000005E7 double
        System.out.println(t3);

        System.out.println("=====================================");

        int maxNum = Integer.MAX_VALUE;//214783647
        int minNum= Integer.MIN_VALUE; //-214783647


        String y= "tRUE";
        boolean o=Boolean.parseBoolean(y);
        boolean o2= Boolean.valueOf(y);


        double maxNum2= Double.MAX_VALUE; // 1.3969695994494

        byte maxNum3 = Byte.MAX_VALUE; // 127

        System.out.println("=================================");

        int[]arr= new int[3];
        System.out.println(Arrays.toString(arr)); // [0,0,0]

        Boolean[] arr2 = new Boolean[3];
        System.out.println(Arrays.toString(arr2)); //[null, null, null]


}





}
