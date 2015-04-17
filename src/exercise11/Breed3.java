/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11;

/**
 *
 * @author Ibn Yahya
 */
public class Breed3 implements Dog {
    
    public Breed3(){
        System.out.println("Breed 3 dog created");
    }
    
    @Override
    public void bark() {
     System.out.println("Breed 3 dog barking");
       }
    
}
