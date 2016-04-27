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
    
    public ArrayList<Guest> getGuestList();
    
    public ArrayList<Car> getCarList();
   
    public void setGuestList(ArrayList<Guest> guestList);
    
    public void setCarlist(ArrayList<Car> carlist);
    
    public void sortAllCarsByGuestID();
    
}
