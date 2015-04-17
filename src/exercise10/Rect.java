
package exercise10;

/**
 *
 * @author Ibrahim Olanigan
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