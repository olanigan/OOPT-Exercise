/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author Ibn Yahya
 */
public abstract class FillColor {
    Shape decorated;
    
    public FillColor(Shape decorated){
        this.decorated = decorated;
    }
    
    void fill(String color){
        System.out.println("Shape is filled with " +  color);
    }
}
