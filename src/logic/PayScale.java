/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.Serializable;

/**
 * Name: Pay Scales
 * purpose: to be used to create pay scale objects for each level
 * @author madan
 * @version 1
 */
public class PayScale implements Serializable {
    static private int LevelCounter = 0;
    private int level;
    private double value;

    public PayScale(int Level, double value) {
        this.level = Level;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    public PayScale(){
    this.level = LevelCounter;
    LevelCounter++;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public static int getIdCounter() {
        return LevelCounter;
    }

    public static void setIdCounter(int idCounter) {
        PayScale.LevelCounter = idCounter;
    }

    /**
     * @author: moosa hammad
     * Name: toArray 
     * Purpose: to convert the array list of employee to an array.
     * @return object - to be used to set the appropriate  pay scale of the employee
     */
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
