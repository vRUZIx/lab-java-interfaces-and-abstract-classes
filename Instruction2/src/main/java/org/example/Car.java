package org.example;

public abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;
    public Car(String vinNumber,String make,String model,int mileage){
        this.vinNumber=getVinNumber();
        this.make=make;
        this.model=model;
        this.mileage=mileage;
    }
    public String getInfo(){
        String info= String.format("Vin number is " + vinNumber + ".\nMake is "+ make +"\nmodel is " + model + "\nmileage is "+mileage);
        return info;
    }

    public void setVinNumber(String vinNumber){
        if(vinNumber.length()==17 && !vinNumber.contains("Q,I,O")){
        this.vinNumber=vinNumber;}
        else{
            System.err.println("Vin code is invalid");
        }
    }
    public String getVinNumber(){
        return vinNumber;
    }
    public void setMake(String make){
        this.make=make;
    }
    public String getMake(){
        return make;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setMileage(int mileage){
        this.mileage=mileage;
    }
    public int getMileage(){
        return mileage;
    }
}
