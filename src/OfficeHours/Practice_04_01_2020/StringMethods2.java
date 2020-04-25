package OfficeHours.Practice_04_01_2020;

public class StringMethods2 {

    public static void main(String[] args) {

        //isEmpty(); checks if the string is empty,return boolean

        String str1 ="    ";

         boolean r1 =   str1.isEmpty();
         boolean r2 = !str1.isEmpty();

        System.out.println(r1);  //false
        System.out.println(r2);  //true


        System.out.println("================================");
        //equals(str):

        // ==
        String s1 = "cat";
        String s2 = new String("cat");
        String s3 = "Cat";
        System.out.println(s2);
        System.out.println(s1==s2); //false
     //      s1.equals(s2); ==>true
        System.out.println(s1.equals(s2));
     //     s3.equals(s1); ==> false
     //     s3.equalsIgnoreCase(s1) ==>true

        System.out.println("====================");

     //contains(str): checks if thr str is icluded in the string, return boolean

        String sentence = "I like to learn Java";
        System.out.println(sentence.contains("Java")); //true

        String sentence2 = "Top 3 viruses are: 1.Corona, 2.Hanta, 3.Ebola";
        System.out.println(sentence2.contains("Corona")); //true
        System.out.println(sentence2.contains("Java"));  //false

        System.out.println("==============================================");

    //  starsWith(str): checks if the string started with given str
    //  endsWith(str):  checks if the string ended with given str

        String webAddress = "www.amazon.com";
        System.out.println(webAddress.startsWith("www")); //true
        System.out.println(webAddress.startsWith("wwww")); //false

        String gmail = "CybertekSchool@gmail.com";

        System.out.println(gmail.endsWith("@gmail.com")); //true

        System.out.println(gmail.endsWith("@hotmail.com")); //false

        System.out.println(gmail.endsWith("@coldmail.com")); //false


    }
}
