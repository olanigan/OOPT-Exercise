/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6;

/**
 *
 * @author Ibn Yahya
 */
public class Troll extends Character{
    
    
    @Override
    public void fight() {
        System.out.println("Troll fight");
        weapon.useWeapon();
    }
    
 
}
