package day33_CustomClass;



import java.util.ArrayList;
import java.util.Arrays;

/*
 task:
			1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 10 or greater


 */
public class warmUp {
    public static void main(String[] args) {

        ArrayList<String> country= new ArrayList<>(Arrays.asList("Turkey","englandddhh","tacikisubhjtan"));
         country.removeIf( p-> p.length()>10);
        System.out.println(country);
        }


    }
