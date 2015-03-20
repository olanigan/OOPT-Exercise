/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

/**
 *
 * @author Ibn Yahya
 */
public class MainClass {
    public static void main(String[] args) {
        R1 r1 = new R1();
        R2 r2 = new R2();
        
        System.out.println("Menu for Restaurant 1 are: ");
        for(Iterator it = r1.createIterator(); it.hasNext();){
            String element = (String) it.next();
            System.out.println("Menu: " + element);
        }
        
        System.out.println("Menu for Restaurant 2 are: ");
     /*   for(Iterator it = r2.createIterator(); it.hasNext();){
            String element = (String) it.next();
            System.out.println("Menu: " + element);
        }*/
    }
    
    
}
