/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Flinkerfyr
 */
public class Guest implements Comparable {
    
    private int ID;
    private String name;

    public Guest(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }  

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Guest{" + "ID=" + ID + ", name=" + name + '}';
    }

    @Override
    public int compareTo(Object o) {
        Guest other = (Guest) o;
        if (equals(other)) {
            return 0;
        }
        
        int nameCompare = name.compareTo(other.getName());
        if (nameCompare == 0) {
            if (this.ID < other.getID()) {
                return 1;
            }
            else {
                return -1;
            }
        }
        
        return nameCompare;
    }
    
}
