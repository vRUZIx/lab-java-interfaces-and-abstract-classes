package org.example;

public class Main {
    public static void main(String[] args) {
        Sedan car1= new Sedan("JTDBR32E720145678","BMW","M3",83000);
        UtilityVehicle car2= new UtilityVehicle("SLSMFSDKNFPAKN","Kamaz","Shaqman",180000,true);
        System.out.println(car1.getInfo());
        car1.setModel("M5");
        car2.setVinNumber("ASFDFAWt13asdjwe12");
        System.out.println(car1.getInfo());
        System.out.println(car2.getInfo());
    }
}
