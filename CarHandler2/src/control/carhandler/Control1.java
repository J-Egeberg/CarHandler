/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.carhandler;

import Model.carhandler.Car;
import Model.carhandler.CarHandler;
import java.util.ArrayList;

/**
 *
 * @author Flinkerfyr
 */
public class Control1 implements InterfaceCarHandler {
    
    public CarHandler handler = new CarHandler();
    
    
    
    public ArrayList<Car> getCarList(){
        return handler.getCarList();
    }
}
