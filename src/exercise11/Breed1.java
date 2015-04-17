
package exercise11;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Breed1 implements Dog {
    
    public Breed1(){
        System.out.println("Breed 1 dog created");
    }
    @Override
    public void bark() {
     System.out.println("Breed 1 dog barking");
       }
    
}
