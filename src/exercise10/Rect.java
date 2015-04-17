/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise10;

/**
 *
 * @author Ibn Yahya
 */
public class Rect implements Shape{
    int width;
    int height;
    
    Rect(int width, int height){
        this.width = width;
        this.height = height;
        
    }
 
    @Override
    public void draw() {
     System.out.println("Drawing rectangle");
    }
}