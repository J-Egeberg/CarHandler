/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Car;
import model.CarHandler;
import java.util.ArrayList;
import view.JFrameCarHandler;

/**
 *
 * @author Flinkerfyr
 */
public class Control implements ControlInterface {
    private CarHandler handler; 
    
    public static void main(String[] args) {
       Control control = new Control();     
    }
    
    public Control (){
        handler = new CarHandler();
        JFrameCarHandler jfch = new JFrameCarHandler(this);
    }
    
    @Override
    public ArrayList<Car> getCarList(){
        return handler.getCars();
    }
    
}
