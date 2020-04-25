package day25_Methodss;

public class Frequency {
    public static void main(String[] args) {
        String str1 = "AAA"; // javajavajavajava
        String str2 = "A";     // java

        int count = 0;
        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
        }
        // we need to make that we are not counting the same index over again
        System.out.println(str1);
        System.out.println(count);

        String a = "pyhton pyhton pyhton"; // ABAAANDFF
        String b = "python";                //A ==>4

         int num1 =   Frequency(a,b);  //3
         System.out.println(num1);
    }

    public static int Frequency(String str1, String str2) {
        int count = 0;
        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
        }
        // we need to make that we are not counting the same


    return count;
}}



