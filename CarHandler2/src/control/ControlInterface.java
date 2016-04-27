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
    
    public ArrayList<Car> getCarList();
   
    public void initGuestList();
    
    public ArrayList<Guest> getGuestList();
   
    public void setGuestList(ArrayList<Guest> guestList);
    
}
