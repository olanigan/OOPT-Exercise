/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6;

/**
 *
 * @author Ibn Yahya
 */
public abstract class Character {
    WeaponBehavior weapon;
    
    public abstract void fight();
    
  //  public abstract void setWeapon(WeaponBehavior w);
    public void setWeapon(WeaponBehavior w){
        this.weapon = w;
    }
    
}
