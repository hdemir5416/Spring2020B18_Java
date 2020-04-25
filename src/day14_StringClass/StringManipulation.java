package day14_StringClass;

public class StringManipulation {
    public static void main(String[] args) {
        String str = " I like java. I like to watch both movie Jumanji";
        int a1 = str.indexOf("J");
        System.out.println(a1); // 16

        int  a2 = str.indexOf("Jum");
        System.out.println(a2); //51

        int a3 = str.indexOf(" I")+1;
        System.out.println(a3);  //24

        String s = "I like Java, and I like reading";
        int b1= s.lastIndexOf("I");
        System.out.println(b1); //17
        int b2 = s.lastIndexOf("l");
        System.out.println(b2); //19

        String z = "I like C#, C# is cool";
        int c1 = z.lastIndexOf("C");
        System.out.println(c1); // 11

        String x = "I like Java, Java is fun,";
        int c3 =x.indexOf("Java is");
   //   int c3 =x.indexOf(", J")+2
  //    int c3 =x.indexOf(" J")+1
        System.out.println(c3);

        int r = x.lastIndexOf("J"); //26
 //     int r = x.lastIndexOf("Java p")

       char ch1 =  x.charAt(26);
        System.out.println(ch1); //J

    }
}
