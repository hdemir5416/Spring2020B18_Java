package day16_ForLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abab";
        String result = "";  //ab

        for(int i=0; i<str.length()-1; i++){
           /*
            if(!result.contains(""+str.charAt(i))){
                result += str.charAt(i);}
                System.out.println(result);
            */
            if(result.contains(""+str.charAt(i))){
                continue;
            }
            result += str.charAt(i);//only gets executed if str.charAt(i) is not contain the result
            System.out.println(result);


        }
    }
    }