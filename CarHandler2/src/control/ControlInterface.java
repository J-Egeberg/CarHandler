/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Car;
import model.Guest;
import model.Rent;

/**
 *
 * @author Flinkerfyr
 */
public interface ControlInterface {
   
    public void initGuestList();
    
    public void initCarList();
    
    public void initRentList();
    
    public ArrayList<Car> getCarList();

    public void setCarList(ArrayList<Car> carList);

    public ArrayList<Car> getCarListForDisplay();

    public void setCarListForDisplay(ArrayList<Car> carListForDisplay);

    public ArrayList<Rent> getRentList();

    public void setRentList(ArrayList<Rent> rentList);
    
    public ArrayList<Guest> getGuestList();

    public void setGuestList(ArrayList<Guest> guestList);

    public ArrayList<Rent> getRentListForDisplay();

    public void setRentListForDisplay(ArrayList<Rent> rentListForDisplay);

    public ArrayList<Guest> getGuestListForDisplay();

    public void setGuestListForDisplay(ArrayList<Guest> guestListForDisplay);
    
    public void addNewCar();
    
    public void deleteCar();
    
    public void searchCar();
    
    public void rentCar();
    
    public void returnCar();
    
    public void displayRentingInformation();
    
    public void showAllAvailableCars ();
    
    public void showAllCarsRentedOut();
    
    public void showNumberOfCarsRentedOut();
    
    public void showTotalDistanceDrivenForAllCars();
    
    public void showMoneyEarnedForAllCars();
    
    public void showCarsWhichNeedRepair();
    
    public void showAllCarsSortedByMostRented();
    
    public void showAllCarsSortedByHighestEarnings();
    
    public void setCarListToCarsRentedByChoosenGuest();
    
    public void setChoosenGuest(int choosenGuestID);
    
    public void askUserToChooseGuest();
}
