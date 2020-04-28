package day29_Wrapper_ArrayList;

public class ParseMethod3 {
    public static void main(String[] args) {

         String str = "123";
         int a = Integer.parseInt(str);  //123
        System.out.println(str+1);   //text      1231
        System.out.println(a+1);     // number   124

         Byte.parseByte(str);    // byte =123

        byte d = Byte.parseByte(str);    // byte =123

        Integer e= Integer.parseInt(str); // Autoboxing

       String str2= "10.5";
        float w= Float.parseFloat(str2);  //float 10.5

      //  double z =Float.parseFloat(str2);

         double g= Double.parseDouble(str2);  // double 10.5

         System.out.println(g);

         String str3 = "58686959";

          long t= Long.parseLong(str3);  //58686959L  //autoboxing

          double v= Long.parseLong(str3);  //5.8686959E7

          String result1= "today is mon"; //not "true" or not "false" ==>false
          boolean h =Boolean.parseBoolean(result1);

          String result2 = "fAlse";  // false
          boolean w1= Boolean.parseBoolean(result2); //false




    }
 }