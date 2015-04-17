/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11;

/**
 *
 * @author Ibn Yahya
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
