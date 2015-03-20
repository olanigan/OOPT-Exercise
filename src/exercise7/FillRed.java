/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author Ibn Yahya
 */
public class FillRed extends FillColor implements Shape{
    
    
    public FillRed(Shape decorated){
        super(decorated);
    }
    @Override
    public void draw() {
        fill("Red");
    }
    
}
