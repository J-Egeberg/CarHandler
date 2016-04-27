/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Car;
import model.CarList;
import java.util.ArrayList;
import model.Guest;
import view.JFrameCarHandler;

/**
 *
 * @author Flinkerfyr
 */
public class Control implements ControlInterface {
    private CarList handler; 
    private ArrayList<Guest> guestList;
    
    public static void main(String[] args) {
       Control control = new Control();     
    }
    
    public Control (){
        handler = new CarList();
        initGuestList();
        JFrameCarHandler jfch = new JFrameCarHandler(this);
    }
    
    @Override
    public ArrayList<Car> getCarList(){
        return handler.getCars();
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
    public ArrayList<Guest> getGuestList(){
        return this.guestList;
    }
    
    @Override
    public void setGuestList(ArrayList<Guest> guestList){
        this.guestList = guestList;
    }
    
    
    
}
