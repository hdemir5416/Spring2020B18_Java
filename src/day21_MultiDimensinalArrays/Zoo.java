package day21_MultiDimensinalArrays;

public class Zoo {
    public static void main(String[] args) {
        String[]wildAnimals = {"tiger","lion","monkey","turtle", "bear"};
        String[]birds= {"eagle", "ducks","chicken"," peacock"};
        //                0        1         2           3
        String[] []zoo={ wildAnimals, birds};
      //                     0           1

    //    zoo[1][3]; //chicken

        String kfc = zoo[1][3];
        System.out.println(kfc); //chicken
        System.out.println("======================================");

        for(String eachBirds  : zoo[1] ){  //4 times
              if(eachBirds.equals("chicken")){
                  continue;
              }

            System.out.println(eachBirds); //eagle,ducks, peacocks, chicken

        }

        System.out.println("================================");

          for(String each: zoo[0]){ //5 times
             if(each.equals("turtle")){
                 continue;
             }

              System.out.println(each); // all wilds - turtle

          }



    }
}
