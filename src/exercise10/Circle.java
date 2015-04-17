
package exercise10;

/**
 *
 * @author Ibrahim Olanigan
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
