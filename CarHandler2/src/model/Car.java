/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Flinkerfyr
 */
public class Car implements Comparable {
    
    private String brand; 
    private String model;
    private int year;
    private int carValue;
    private int topSpeed;
    private int numberOfSeats;
    private Boolean trunkPresent;

    public Car(String brand, String model, int year, int carValue, int topSpeed, int numberOfSeats, Boolean trunkPresent) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.carValue = carValue;
        this.topSpeed = topSpeed;
        this.numberOfSeats = numberOfSeats;
        this.trunkPresent = trunkPresent;
    }
    
    public Car(){
    }

    @Override
    public String toString() {
        return "Brand: " + brand + 
               " Model: " + model + 
               " Year: " + year + 
               " Carvalue: " + carValue + 
               " Topspeed: " + topSpeed + 
               " Seats" + numberOfSeats +
               " trunk " + trunkPresent ;
    }
    

    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCarValue() {
        return carValue;
    }

    public void setCarValue(int carValue) {
        this.carValue = carValue;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Boolean getTrunkPresent() {
        return trunkPresent;
    }

    public void setTrunkPresent(Boolean trunkPresent) {
        this.trunkPresent = trunkPresent;
    }

    @Override
    public int compareTo(Object o) {
        Car other = (Car) o;
        if (equals(other)) {
            return 0;
        }
        int carFieldCmp = this.brand.compareTo(other.getBrand());
        if (carFieldCmp == 0) {
            
        }
        
        return carFieldCmp;
        
    }
    
    
    
    
    
}
