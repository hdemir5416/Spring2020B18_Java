package day13_StringClass;

public class String_Manipulations {
    public static void main(String[] args) {

        String str = "Cybertek";
   //                 01234567
          char ch1=  str.charAt(5);//'t'
        System.out.println(ch1); //t
        System.out.println(ch1=='A'); //false
   //                         'e' == 'A'  false
        System.out.println(ch1 =='T'); // 't' =='T' false

        String a = "Demir Hilal";
        char  b = a.charAt(7);
        System.out.println(b);
        int totalLength1 = str.length();
        System.out.println(totalLength1);

          int totalLength = str.length();
        System.out.println(totalLength);   //8
        System.out.println(totalLength>250); // false

        String str2 = "Today is great day, Java is Fun";

        int maxIndexNum = str2.length()-1;
        System.out.println(maxIndexNum); //30

        String s1 = "Cybertek";
             s1=   s1.concat("School");  //Cybertek School
   //         s1.concat("School");  //Cybertek

        String s2 = "Java";
               s2.concat("is a programming language");  //Java
            s2 = s2.concat("is a programming language");  //Java is a programing...

        String r1 = "Java is fun";
                r1.concat(",and it is easy"); //Java is fun
          r1 = r1.concat(",and it is easy");  // Java is fun and it is fun

        String name1 = "CYBERTEK";
               name1.toLowerCase();  //CYBERTEK
          name1 = name1.toLowerCase();  //cybertek

        String name3 = "cybertek school";
          name3 = name3.toUpperCase(); //CYBERTEK SCHOOL

        String A1 = "       Today is good  ?";
               A1.trim(); // no modified
         A1= A1.trim(); // "Today is good"



    }


}
