package day15_ForLoop;

public class reverseString {
    public static void main(String[] args) {
       String str = "Java";
        String reverse =""+ str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        int lastIndexNum = str.length()-1;

         String reverse2= "";
         for(int i=lastIndexNum; i>=0 ; i--){
             System.out.println(str.charAt(i));
        //    reverse2 +=str.charAt(i);
         }

    }
}
