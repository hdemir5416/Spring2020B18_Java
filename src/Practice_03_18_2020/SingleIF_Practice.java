package Practice_03_18_2020;

public class SingleIF_Practice {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        boolean aGreater = a > b ;
        boolean bGreater = b > a ;
        //boolean aEqualB = a ==b;
        // boolean aEqualB = a ==b;
        // boolean aEqualB = aGreater == false && bGreater ==false;



          if (aGreater){
            System.out.println(a +" is greater number"); }

          if(bGreater){
            System.out.println(b+ "is greater number"); }

          System.out.println(a+ " is equal to "+b );
         }
}
