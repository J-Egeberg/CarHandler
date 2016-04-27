/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Car;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import model.Guest;
import view.JFrameCarHandler;

/**
 *
 * @author Flinkerfyr
 */
public class Control implements ControlInterface {
    private ArrayList<Guest> guestList;
    private ArrayList<Car> carList;
    

    public static void main(String[] args) {
       Control control = new Control();     
    }
    
    public Control (){
        initGuestList();
        initCarList();
        JFrameCarHandler jfch = new JFrameCarHandler(this);
    }
    
    
    @Override
    public void initGuestList(){
        guestList = new ArrayList();
    
        guestList.add(new Guest(00000001));
        guestList.add(new Guest(00000002));
        guestList.add(new Guest(00000003));
        guestList.add(new Guest(00000004));
        guestList.add(new Guest(00000005));
        guestList.add(new Guest(00000006));
        guestList.add(new Guest(00000007));
             
    }
    
    @Override
    public void initCarList(){
        
        carList = new ArrayList();
        
        carList.add(new Car("Tesla", "ssx", 2015, 200000, 240, 2, false));
        carList.add(new Car("Aston Martin", "Vanquish", 2015, 250000, 250, 2, true));
        carList.add(new Car("Porsche", "DB9", 2015, 270000, 200, 2, true));
        carList.add(new Car("Citroen", "C5", 2015, 280000, 180, 4, true));
        carList.add(new Car("Ferrari", "F430", 2015, 290000, 300, 2, true));
        carList.add(new Car("Ferrari", "F458", 2015, 590000, 310, 2, false));
        carList.add(new Car("Ferrari", "Enzo", 2015, 390000, 330, 2, false));
        
    }

    @Override
    public ArrayList<Car> getCarList() {
        return this.carList;
    }
    
    @Override
    public ArrayList<Guest> getGuestList(){
        return this.guestList;
    }
    
    @Override
    public void setGuestList(ArrayList<Guest> guestList){
        this.guestList = guestList;
    }
    
    @Override
    public void setCarlist(ArrayList<Car> carlist) {
        this.carList = carList;
    }

    @Override
    public void sortAllCarsByGuestID() {
        carList.toArray();
        ArrayList.sort(carList); //Sort list of cars with Arrays.sort (Remenber to make Cars comparable by GuestID)
    }
    
    
    
}
