package day26_Methodoverloading;

public class warm2_unique {
    public static void main(String[] args) {

        String str= "ABB";
        String result=""; //AA

     for(int i=0; i<str.length(); i++) {
      int num =  frequency(str,str.charAt(0));
      if(num==1){
          result += str.charAt(0);
      }
    }
        System.out.println(result);}

        String str2= "Cybertek";
        String result2 = uniques(str2);

   public static String uniques(String str){

       String result=""; //AA

       for(int i=0; i<str.length(); i++) {
           int num = frequency(str, str.charAt(0));
           if (num == 1) {
               result += str.charAt(0);
           }
       }
           return "Cybertek";}


    public static int frequency(String str,char ch){ // counts the ch's frequency
        char[] arr=  str.toCharArray(); //[A, A, A]

        int count=0;
        for( char each:arr) {

            if (each == ch) {
                count++;
            }
        }
        return count;
    }


}
