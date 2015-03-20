/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author Ibn Yahya
 */
public class MainClass {
    
     public static void main(String[] args) {
         Line line = new Line();
         line.draw();
        BorderBlue b = new BorderBlue(line);
        b.draw();
        
        
        Circle c = new Circle();
        c.draw();
        Rectangle r = new Rectangle();
        r.draw();
        
        FillRed fc = new FillRed(c);
        fc.draw();
        
        FillRed fr = new FillRed(r);
        fr.draw();
    
     }
   
    
}
