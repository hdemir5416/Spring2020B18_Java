package day13_StringClass;

public class StringMaipulations2 {
    public static void main(String[] args) {

        String str = "Cybertek school is the best";

        String schoolName =str.substring(0,7) ;
        System.out.println(schoolName); // Cyberte

        String fullName = "Kuzzat Altay";
        //                 012345678....
        String firstName= fullName.substring(0,6);
        System.out.println(firstName); //Kuzzat
        String lastName= fullName.substring(7,12);
        System.out.println(lastName);  // Altay

        //full name = firstname + lastname
        //gmail: lastname_firstname@gmail.com

        String Murtaza = "Murtaza Nazeeri";
       //                 01234567.........
        String firstname = Murtaza.substring(0,7);
        System.out.println(firstname);  //Murtaza
        String lastname = Murtaza.substring(8,15);
        System.out.println(lastname);  //Nazeeri

       // String gmail = lastname.concat("_").concat(firstname).concat("@gmail.com");

        String gmail =lastname+"_"+firstname+"@gmail.com";
        System.out.println(gmail); //Nazeeri_Murtaza@gmail.com

        String s2 = "I like C# Programing   C# C#";
           s2 = s2.replace("C#" , "Java");

        String name = "Covid 18";
           name = name.replace("8","9");
        System.out.println(name); // Covid 19





        String r2 = "today is  monday, tomorrow is tuesday";
            r2= r2.replace("tomorrow","today");

    }



}
