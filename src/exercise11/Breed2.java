
package exercise11;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Breed2 implements Dog {
    
    public Breed2(){
        System.out.println("Breed 2 dog created");
    }
    
    @Override
    public void bark() {
     System.out.println("Breed 2 dog barking");
       }
    
}
