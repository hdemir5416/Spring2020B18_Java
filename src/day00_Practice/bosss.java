package day00_Practice;



public class bosss {

    public static void main(String[] args) {

        System.out.println( isAnagram("anne","Anen"));

    }

    public static boolean isAnagram(String word1, String word2) {
       int count=0;
        for (int i = 0; i < word1.length(); i++) {
            if(word2.toLowerCase().contains(word1.toLowerCase().substring(i,i+1))){
                count++;}}


          if(word1.length()==word2.length()&& count==word1.length()){
              return true;
          }else{
              return false;
          }


    }}