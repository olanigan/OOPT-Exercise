/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author Ibn Yahya
 */
public class BorderBlue extends BorderColor implements Shape{
    
    public BorderBlue(Shape decorated){
        super(decorated);
    }
    
    @Override
    public void draw() {
        border("Blue");
    }
    
}
