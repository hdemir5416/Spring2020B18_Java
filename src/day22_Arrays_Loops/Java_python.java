package day22_Arrays_Loops;
/* 3. write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)



 */
public class Java_python {
    public static void main(String[] args) {


        String sentence = " i like java and javascript";
        int countJava = 0;  //2
        int countPython =0;
         String []words =  sentence.split(" "); //[ i , like , java, and, javascript]

           for(String each  : words){
               if(each.contains("java")){
                   countJava++;
               }
             if(each.contains("Python")){
                 countPython++;
             }


           }
        System.out.println(countJava==countPython); //2




    }
}
