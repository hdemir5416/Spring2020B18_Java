package day33_CustomClass;
/*
      data/ attributes: instance variable
      breed , color, age
      action: instance methods
      sleep(),eat(),drink()
 */
public class Cat {

         String breed;
         String color;
         int age;
         String name;

         public void sleep(){
             System.out.println(name+" is seeling");
         }
        public void eat(String catfood){
            System.out.println(name+" is eating");
        }
        public void drink(String drink){
            System.out.println(name+" is drinking");
        }
        public void setCatInfo(String catbreed,String catColor,int catAge, String catName){
           breed= catbreed;
           color= catColor;
           age= catAge;
           name = catName;
        }
   public String toString(){
             return name+", breed is "+breed+", color is "+color+", "+age+" ";
   }

    }

