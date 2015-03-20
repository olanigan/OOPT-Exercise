/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author Ibn Yahya
 */
public abstract class BorderColor {
    Shape decorated;
    
    public BorderColor(Shape decorated){
        this.decorated = decorated;
    }
    
    void border(String color){
        System.out.println("Border color is now  " +  color);
    }
}
