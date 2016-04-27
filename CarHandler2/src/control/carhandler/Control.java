/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.carhandler;

import model.carhandler.Car;
import model.carhandler.CarHandler;
import java.util.ArrayList;

/**
 *
 * @author Flinkerfyr
 */
public class Control implements InterfaceCarHandler {
    
    public CarHandler handler = new CarHandler();
    
    
    
    public ArrayList<Car> getCarList(){
        return handler.getCarList();
    }
}
