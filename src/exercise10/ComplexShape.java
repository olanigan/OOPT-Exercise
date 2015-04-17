
package exercise10;

import java.util.ArrayList;

/**
 *
 * @author Ibrahim Olanigan
 */
public class ComplexShape implements Shape{
    ArrayList<Shape> shapes;
    
    public ComplexShape(){
        shapes = new ArrayList<>();
    }
    
    public void addShape(Shape s){
        shapes.add(s);
       System.out.println("New shape added");
    }
    @Override
    public void draw() {
     System.out.println("Drawing complex shape");
    }
    
    public static void main(String[] args) {
        ComplexShape cShape = new ComplexShape();
        
        Rect rect1 = new Rect(2,3);
        Circle circle1 = new Circle(2);
        
        cShape.addShape(rect1);
        cShape.addShape(circle1);
        cShape.draw();
    }
        
        
}
