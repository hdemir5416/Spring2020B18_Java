package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class catObjects {

    public static void main(String[] args) {
        Cat cat1= new Cat();
        cat1.setCatInfo("siems","white",2,"Sasha");
       // System.out.println(cat1); //Shaha siemes ,color is white

        Cat cat2 = new Cat();
        cat2.setCatInfo("kahve","brw",2,"gasd");

        Cat cat3= new Cat();
        cat3.setCatInfo("calico","brown",6,"cinnamon");

         ArrayList<Cat> catList= new ArrayList<>();
         catList.addAll(Arrays.asList(cat1,cat2,cat3));

         for(int i=0;i<catList.size(); i++){
             System.out.println(catList.get(i));


             System.out.println("=====================");

           cat1.sleep();
           cat2.sleep();
           cat3.sleep();

             System.out.println("========================");

            cat1.eat("cat treats"); // Sasha is eating
             cat2.eat("fish");

             System.out.println("==============================");

cat1.drink("water");
cat2.drink("milk");


         }
    }
        }
