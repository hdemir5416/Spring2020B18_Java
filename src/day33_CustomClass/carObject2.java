package day33_CustomClass;

public class carObject2 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.Brand = "BMV";
        car1.model = "X5";
        car1.year =2020;
        car1.color = "REd";

        System.out.println(car1.Brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        Car car2 = new Car();
             car2.Brand ="toyota";
             car2.model= "corolla";
             car2.year = 2020;
             car2.color= "White";

        System.out.println(car2.Brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);


    car2.start();
    car2.drive();

    car2.getInfo();
        System.out.println("=====================");

        Car car3 = new Car();
        car3.Brand = "Mercedes";
        car3.model = "C class";
        car3.year =2020;
        car3.color ="Black";

        car3.getInfo();
        car3.start();
        car3.drive();

        String str =" A";
        String str2= "B";
        String []arr = {str, str2};

        Car[]cars ={car1,car2,car3};

        cars[0].getInfo();
        cars[1].getInfo();
        cars[2].getInfo();
        /* create 5 car object
           put them in an array of cars
           use for loop to get each car info
           use for each loop to get each car info
         */
    }

}
