package day13_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {

        String str = "I like Java programming John";
         int  num1 =  str.indexOf("J");
        int num2 =  str.indexOf("John"); //24
         System.out.println(num1); //7

        String str3 = "Cybertek school is awesome";
        //             0123456789....
          int firstS = str3.indexOf("s"); //10
          int secondS = str3.indexOf("is") +1;
          // str2.indexOf("is") ==> returns the Index number of 1
        System.out.println(firstS); //9
        System.out.println(secondS); // 17

        int maxIndexnumber = "Cybertek".length(); //9

        String names = "Muhtar";
           int a = names.indexOf("good guy");
        System.out.println(a); // -14

    }
}
