/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11;

/**
 *
 * @author Ibn Yahya
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
