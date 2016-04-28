/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author scheldejonas
 */
public class Rent {
    
    private Date startDate;
    private int daysOfRent;
    private int totalPrice;
    private ArrayList<Car> cars;
    private Guest guest;

    /**
     * This is for contruction the renting before the customer is sure about what cars he want to rent.
     * @param startDate
     * @param daysOfRent 
     */
    public Rent(Date startDate, int daysOfRent) {
        this.startDate = startDate;
        this.daysOfRent = daysOfRent;
    }

    /**
     * This is for the complete renting object construction, when the customer knows the full request at the desk.
     * @param startDate
     * @param daysOfRent
     * @param totalPrice
     * @param cars
     * @param guest 
     */
    public Rent(Date startDate, int daysOfRent, int totalPrice, ArrayList<Car> cars, Guest guest) {
        this.startDate = startDate;
        this.daysOfRent = daysOfRent;
        this.totalPrice = totalPrice;
        this.cars = cars;
        this.guest = guest;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getDaysOfRent() {
        return daysOfRent;
    }

    public void setDaysOfRent(int daysOfRent) {
        this.daysOfRent = daysOfRent;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    /**
     * This prints out the order as it is, without the car list, just for display to system, not to the customer.
     * You need to loop the cars to get the information out about the cars.
     * @return 
     */
    @Override
    public String toString() {
        return "Renting{" + "startDate=" + startDate + ", daysOfRent=" + daysOfRent + ", totalPrice=" + totalPrice + ", guest=" + guest + '}';
    }
    
}
