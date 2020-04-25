package OfficeHours.Practice_04_01_2020;

public class StringMethods {
    public static void main(String[] args) {

        //  charAt(indexNumber): returns the char at the given index,char primitive

      String str1= "Java";
        //          0123

         char ch1 = str1.charAt(3);
        System.out.println(ch1);  //a

        char ch2 = str1.charAt(4); // -1

         System.out.println("========================================");

        //length(): returns the total number of chars,
        String str2 = "Cybertek School";

        int total =  str2.length();
        System.out.println(total);  //15

        //   int maxIndex = str2.length -1  //14

        System.out.println("===========================================");

        //   concat(str): concatenation

        String str3 = "Cybertek";

             str3.concat("School");  // Cybertek

          String     str4 = str3.concat("School"); // Cybertek School

        System.out.println("============================================");

        // toLowerCase() & toUpperCase(): change the case of the string

         String str5 = "Cybertek";str5 = str5.toUpperCase();

        System.out.println(str5);  // CYBERTEK


        System.out.println("================================");

        //trim(): removes unused space from string

        String str7 = "            Cybertek";
              str7= str7.trim(); // "Cybertek" //8

        System.out.println(str7.length());  //16
        String str8  = "      ";
             str8 =str8.trim(); //0

        System.out.println("=====================================");

        //substring(beginninindex, ending index: creates substring from beginnig index till ending index)
           String sentence1= "I like Java";
        //                    012345678910

           String a = sentence1.substring(7,11);  //java
       //             (7, sencente1.length()-1)   //java

           String b = sentence1.substring(2,6);  //like

           String c = (a+b); //likejava


         //substring(beginning index
           String sentence2 = "I like to Java";
                     //        0123456789....

           String ab = sentence2.substring(2); // "learn Java"
        System.out.println(ab);

         String r2 = "Java";  //JaVa
        String r3 = r2.substring(0,2); //Ja
        String r4 = r2.substring(2,3).toLowerCase(); //v
        String r5 = r2.substring(3); //a

        String result = r3+r4+r5; //JaVa

        System.out.println("==============================================");

      //  replace (old str, new string)

        String str = "I like C#, C# is cool";
             str =   str.replace("C#","Java"); // I like Java,Java is cool

        //replaceFirst(old str, new str)

        String t1 = "Java is fun,Java is good";
        t1 = t1.replaceFirst("Java","C#");//C# is fun, Java is good
     //                            " Java"         "C#" ==> JAva is fun,C# is good

        System.out.println("============================");

        //indexOF();returns the index of first matching character, as an int
          String y1 = "Today is Wendesday";
          int a1 = y1.indexOf("w"); //9 (first one)
         int a2 = y1.indexOf("Wendesday"); // 9

        //lastIndexOf(str):returns the index of last matching character, as an int

        String y2 = "Cybertek School";
        int a4 = y2.lastIndexOf("S"); //17













    }
}
