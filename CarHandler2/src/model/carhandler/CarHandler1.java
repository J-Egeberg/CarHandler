/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.carhandler;

import java.util.ArrayList;

/**
 *
 * @author Flinkerfyr
 */
public class CarHandler1 {
    
    public ArrayList<Car> Cars;
    
    public void carInfo(){
        
        Cars = new ArrayList();
        
        Cars.add(new Car("Tesla", "ssx", 2015, 200000, 240, 2, false));
        Cars.add(new Car("Aston Martin", "Vanquish", 2015, 250000, 250, 2, true));
        Cars.add(new Car("Porsche", "DB9", 2015, 270000, 200, 2, true));
        Cars.add(new Car("Citroen", "C5", 2015, 280000, 180, 4, true));
        Cars.add(new Car("Ferrari", "F430", 2015, 290000, 300, 2, true));
        Cars.add(new Car("Ferrari", "F458", 2015, 590000, 310, 2, false));
        Cars.add(new Car("Ferrari", "Enzo", 2015, 390000, 330, 2, false));
        
    }

    public ArrayList<Car> getCarList() {
        return Cars;
    }
     
}

