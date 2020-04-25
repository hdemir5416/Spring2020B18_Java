package day23_methods;

public class methods_withparameters2 {

    //create a function that can reverse any string

    // "Muhtar ==> rathuM, "Cybertek" ==> ketrebyC

    public static void main(String[] args) {
         String name1 ="Hilal";
         ReverseString(name1);

         String name2="Cybertek scholl";
         ReverseString(name2);
    }

    public static void ReverseString (String str){

        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i)+"");
        }
    }





}
