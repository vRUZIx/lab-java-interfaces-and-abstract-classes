package org.example;

public class Truck extends Car{
    double towingCapacity;
    public Truck(String vinNumber,String make,String model,int mileage,double towingCapacity){
        super(vinNumber, make ,model ,mileage);
        this.towingCapacity=towingCapacity;
    }
    public double getTowingCapacity(){
        return towingCapacity;
    }
    public void setTowingCapacity(double towingCapacity){
        this.towingCapacity=towingCapacity;
    }
    @Override
    public String getInfo(){
        String info= String.format("Vin number is " + getVinNumber() + ".\nMake is "+ getMake() +"\nmodel is " + getModel() + "\nmileage is "+getMileage() +"\nWing capacity is " +getTowingCapacity());
        return info;
    }
}
