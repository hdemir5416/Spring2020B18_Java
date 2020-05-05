package day33_CustomClass;

public class Car {
    public String Brand;
    public String model;
    public int year;
    public String color;

    public void  start(){

        System.out.println(Brand+" is started");
    }

    public void drive(){
        System.out.println("Driving"+Brand );
    }
    public void  getInfo(){
         System.out.println(year+" "+Brand+" "+model+" "+color);

     }
public void setInfo(String carBrand, String carModel, int carYear, String carColor){
        Brand = carBrand;
        model= carModel;
        year =carYear;
         color=carColor;
}
      public String toString(){
        String result = year+" "+Brand+" "+model+" "+color;
        return result;
      }

     // year+
    public static void main(String[] args) {
        int a=100; // local variable
    }
}
