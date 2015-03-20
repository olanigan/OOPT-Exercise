/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6;

/**
 *
 * @author Ibn Yahya
 */
public class Queen extends Character{
 //    private WeaponBehavior weapon;
    
    @Override
    public void fight() {
        System.out.println("Queen fight");
      weapon.useWeapon();
    }
    
    
}

