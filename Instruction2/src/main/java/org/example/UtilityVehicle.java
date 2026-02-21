package org.example;

public class UtilityVehicle extends Car{
    boolean isFourWheelVehicle;
    public UtilityVehicle(String vinNumber,String make,String model,int mileage,boolean isFourWheelVehicle){
        super(vinNumber, make ,model ,mileage);
        this.isFourWheelVehicle=isFourWheelVehicle;
    }
    public String getFourWheelVehicle(){
        if(isFourWheelVehicle){return "This utiliyVehicle has 4 wheel";}
        else{return "This utilityVehicle  has not 4 wheel";}
    }
    public void setFourWheelVehicle(boolean isFourWheelVehicle){
        this.isFourWheelVehicle=isFourWheelVehicle;
    }
    @Override
    public String getInfo(){
        String info= String.format("Vin number is " + getVinNumber() + ".\nMake is "+ getMake() +"\nmodel is " + getModel() + "\nmileage is "+getMileage() +"\n" +getFourWheelVehicle());
        return info;
    }
}
