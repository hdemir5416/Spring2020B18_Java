package day18_nestedLoops;

public class StringReverse {
    public static void main(String[] args) {

   String str="I like Java";

   String rev ="";

   int  lastIndex = str.length()-1;

   do{
       str.charAt(lastIndex);
      lastIndex--;
   }while(lastIndex >=0);

        System.out.println(rev);
    }
}
