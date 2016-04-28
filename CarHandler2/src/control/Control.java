/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 * TO DO's
 * - Make method to create rent's for never rent more then 1 car from the carpark. Do not implement this in initRentList, unless it get's changed to DB.
 * 
 */

import model.Car;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import model.Guest;
import model.Rent;
import view.JFrameCarHandler;

/**
 *
 * @author Flinkerfyr
 */
public class Control implements ControlInterface {
    
    public static void main(String[] args) {
        Control control = new Control();
    }

    private ArrayList<Guest> guestList;
    private ArrayList<Car> carList;
    private ArrayList<Car> carListForDisplay;
    private ArrayList<Rent> rentList;
    private ArrayList<Rent> rentListForDisplay;
    private ArrayList<Guest> guestListForDisplay;

    public Control() {
        initGuestList();
        initCarList();
        initRentList();
        JFrameCarHandler jfch = new JFrameCarHandler(this);
    }

    @Override
    public void initGuestList() {
        guestList = new ArrayList();

        guestList.add(new Guest(00000001));
        guestList.add(new Guest(00000002));
        guestList.add(new Guest(00000003));
        guestList.add(new Guest(00000004));
        guestList.add(new Guest(00000005));
        guestList.add(new Guest(00000006));
        guestList.add(new Guest(00000007));
        
        guestListForDisplay = guestList;
    }

    @Override
    public void initCarList() {

        carList = new ArrayList();

        carList.add(new Car("Tesla", "ssx", 2015, 200000, 240, 2, false));
        carList.add(new Car("Aston Martin", "Vanquish", 2015, 250000, 250, 2, true));
        carList.add(new Car("Porsche", "DB9", 2015, 270000, 200, 2, true));
        carList.add(new Car("Citroen", "C5", 2015, 280000, 180, 4, true));
        carList.add(new Car("Ferrari", "F430", 2015, 290000, 300, 2, true));
        carList.add(new Car("Ferrari", "F458", 2015, 590000, 310, 2, false));
        carList.add(new Car("Ferrari", "Enzo", 2015, 390000, 330, 2, false));
        
        carListForDisplay = carList;
    }
    
    @Override
    public void initRentList() {
        rentList = new ArrayList();
        
        Date tempStartDate = new Date();
        Date oldTempStartDate = new Date("Fri, 01 Jan 2016 13:14:21 GMT");
        Date oldestTempStartDate = new Date("Thu, 01 Jan 2015 13:14:21 GMT");
        
        rentList.add(new Rent(tempStartDate, 10, carList.get(1), guestList.get(0))); //Creating a hardcoded rent for the traing of the assignment purpose.
        rentList.add(new Rent(oldTempStartDate, 10, carList.get(0), guestList.get(0))); //Creating a hardcoded rent for the traing of the assignment purpose.
        rentList.add(new Rent(tempStartDate, 10, carList.get(2), guestList.get(1))); //Creating a hardcoded rent for the traing of the assignment purpose.
        rentList.add(new Rent(oldTempStartDate, 10, carList.get(1), guestList.get(1))); //Creating a hardcoded rent for the traing of the assignment purpose.
        rentList.add(new Rent(oldestTempStartDate, 10, carList.get(2), guestList.get(1))); //Creating a hardcoded rent for the traing of the assignment purpose.
        rentList.add(new Rent(tempStartDate, 10, carList.get(5), guestList.get(2))); //Creating a hardcoded rent for the traing of the assignment purpose.
        rentList.add(new Rent(oldTempStartDate, 10, carList.get(5), guestList.get(2))); //Creating a hardcoded rent for the traing of the assignment purpose.
        rentList.add(new Rent(oldestTempStartDate, 10, carList.get(5), guestList.get(2))); //Creating a hardcoded rent for the traing of the assignment purpose.
        rentList.add(new Rent(tempStartDate, 10, carList.get(6), guestList.get(3))); //Creating a hardcoded rent for the traing of the assignment purpose.
        rentList.add(new Rent(oldTempStartDate, 10, carList.get(3), guestList.get(4))); //Creating a hardcoded rent for the traing of the assignment purpose.
        rentList.add(new Rent(oldestTempStartDate, 10, carList.get(0), guestList.get(5))); //Creating a hardcoded rent for the traing of the assignment purpose.

        rentList = rentListForDisplay;
    }

    @Override
    public ArrayList<Car> getCarList() {
        return carList;
    }

    @Override
    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }

    @Override
    public ArrayList<Car> getCarListForDisplay() {
        return carListForDisplay;
    }

    @Override
    public void setCarListForDisplay(ArrayList<Car> carListForDisplay) {
        this.carListForDisplay = carListForDisplay;
    }

    @Override
    public ArrayList<Rent> getRentList() {
        return rentList;
    }

    @Override
    public void setRentList(ArrayList<Rent> rentList) {
        this.rentList = rentList;
    }

    @Override
    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    @Override
    public void setGuestList(ArrayList<Guest> guestList) {
        this.guestList = guestList;
    }

    @Override
    public ArrayList<Rent> getRentListForDisplay() {
        return rentListForDisplay;
    }

    @Override
    public void setRentListForDisplay(ArrayList<Rent> rentListForDisplay) {
        this.rentListForDisplay = rentListForDisplay;
    }

    @Override
    public ArrayList<Guest> getGuestListForDisplay() {
        return guestListForDisplay;
    }

    @Override
    public void setGuestListForDisplay(ArrayList<Guest> guestListForDisplay) {
        this.guestListForDisplay = guestListForDisplay;
    }
    
    @Override
    public void addNewCar() {
        String cBrand = JOptionPane.showInputDialog("Enter car brand");
        String cModel = JOptionPane.showInputDialog("Enter car model");
        int cYear = Integer.parseInt(JOptionPane.showInputDialog("Enter car year"));
        int cValue = Integer.parseInt(JOptionPane.showInputDialog("Enter car price"));
        int cTopSpeed = Integer.parseInt(JOptionPane.showInputDialog("Enter topspeed"));
        int cSeats = Integer.parseInt(JOptionPane.showInputDialog("Enter number of seats"));
        Boolean cTrunk = Boolean.parseBoolean(JOptionPane.showInputDialog("Type \"true\" if the car has a trunk"));

        carList.add(new Car(cBrand, cModel, cYear, cValue, cTopSpeed, cSeats, cTrunk));
    }

    @Override
    public void deleteCar() {
        String cBrand = JOptionPane.showInputDialog("Enter car brand");
        String cModel = JOptionPane.showInputDialog("Enter car model");
        int cYear = Integer.parseInt(JOptionPane.showInputDialog("Enter car year"));
        int cValue = Integer.parseInt(JOptionPane.showInputDialog("Enter car price"));
        int cTopSpeed = Integer.parseInt(JOptionPane.showInputDialog("Enter topspeed"));
        int cSeats = Integer.parseInt(JOptionPane.showInputDialog("Enter number of seats"));
        Boolean cTrunk = Boolean.parseBoolean(JOptionPane.showInputDialog("Type \"true\" if the car has a trunk"));

        carList.remove(new Car(cBrand, cModel, cYear, cValue, cTopSpeed, cSeats, cTrunk));
    }

    @Override
    public void searchCar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rentCar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void returnCar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayRentingInformation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showAllAvailableCars() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showAllCarsRentedOut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showNumberOfCarsRentedOut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showTotalDistanceDrivenForAllCars() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showMoneyEarnedForAllCars() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showCarsWhichNeedRepair() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showAllCarsSortedByMostRented() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showAllCarsSortedByHighestEarnings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void setCarListToCarsRentedByGuestID(int askedGuestID) {
        for (Rent rent : rentList) {
            if (rent.getGuest().getID() != askedGuestID) {
                
            }
        }
    }

}
