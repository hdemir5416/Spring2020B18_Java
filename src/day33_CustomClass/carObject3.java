package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class carObject3 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setInfo("BMV", "X6",2020,"white");
        car1.getInfo();

        Car car2 = new Car();
        car2.setInfo("toyota","corolla",2020,"red");
         car2.getInfo();
     /*   Car car2 = new Car();
        car2.Brand= "toyota";
        car2.model="corolla";
        car2.year= 2020;
        car2.color ="red";*/

     Car car3 = new Car();
     car3.setInfo("auid","q7",2019,"gray");
    car3.getInfo();

        System.out.println("===============================");
    Car[]cars ={car1,car2,car3};
            //String []arr= {"A","B", 123};

    //    for(Car eachCar:cars){
    //        eachCar.getInfo();

        for(int i=0; i<cars.length;i++){
            cars[i].getInfo();
        }
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list3); //toString method gets executed automaticly

    }

}
