package day21_MultiDimensinalArrays;

public class ScrumTeam {
    public static void main(String[] args) {
        //                    0        1      2        3
        String[] DevTeam = {"Hilal", "Osman", "Eren", "Gulsen"};

        String[] TestersTeam = {"Ekrem", "Kerem", "Ceren", "Bilal"};

        String[] PO = {"ali", "ayse"};

        String[] TesterTeam2 = {"Ali","Veli","Deli"};

        String[][] ScrumTeam = {DevTeam, TestersTeam, PO};
        //                         0          1         2
        ScrumTeam[0][3] = "Gulsen";
        ScrumTeam[1]= TesterTeam2;

        System.out.println(ScrumTeam[0][3]); //gulsen

        String info = ScrumTeam[1][2];
        System.out.println(info);  //Ceren

        System.out.println("==================================");

        for (String eachEmployee : ScrumTeam[0]) {
            System.out.println(eachEmployee);//devteam

            //    for( String eachEmployee :ScrumTeam[2]){
            //           System.out.println(eachEmployee);//PO}

            System.out.println("===============================");

            System.out.println(ScrumTeam[2][1]);//ayse

           String[] b = {"Ali","Veli","Deli"};

        }


    }
}