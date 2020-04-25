package day17_WhileLoops;

public class RemoveDuplicates {

    public static void main(String[] args) {
  // while(!result.contains(""+str.charAt(i))){WHILE RESULT DOES not contains at chari,the we concate


        String str= "Java is fun, Java is cool";  // is fun, is cool

         int count = 0;  //1,1,1,

         while(str.contains("Java")){
             count++;
             str = str.replaceFirst("Java","");//after counting the first "java,we remove it
         }

        System.out.println(count);





    }
}
