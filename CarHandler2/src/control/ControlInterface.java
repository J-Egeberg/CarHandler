/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Car;
import model.Guest;

/**
 *
 * @author Flinkerfyr
 */
public interface ControlInterface {
   
    public void initGuestList();
    
    public void initCarList();
    
    public void initRentList();
    
    public ArrayList<Guest> getGuestList();
    
    public ArrayList<Car> getCarList();
   
    public void setGuestList(ArrayList<Guest> guestList);
    
    public void setCarlist(ArrayList<Car> carlist);
    
    public void addNewCar();
    
    public void deleteCar();
    
    public void searchCar();
    
    public void rentCar();
    
    public void returnCar();
    
    public void displayRentingInformation();
    
    public void sortAllCarsByGuestID();
    
    public void showAllAvailableCars ();
    
    public void showAllCarsRentedOut();
    
    public void showNumberOfCarsRentedOut();
    
    public void showTotalDistanceDrivenForAllCars();
    
    public void showMoneyEarnedForAllCars();
    
    public void showCarsWhichNeedRepair();
    
    public void showAllCarsSortedByMostRented();
    
    public void showAllCarsSortedByHighestEarnings();
}
