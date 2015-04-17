/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise10;

/**
 *
 * @author Ibn Yahya
 */
public class Circle implements Shape{
    int size;
    
    public Circle(int size){
        this.size = size;
    }
    
    @Override
    public void draw() {
     System.out.println("Drawing circle");
    }
}
