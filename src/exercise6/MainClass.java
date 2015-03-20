/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6;

/**
 *
 * @author Ibn Yahya
 */
public class MainClass {
    public static void main(String[] args) {
        King king = new King();
        king.setWeapon(new SwordBehavior());
        king.fight();
        
        
        Queen queen = new Queen();
        queen.setWeapon(new KnifeBehavior());
        queen.fight();
        
        Knight knight = new Knight();
        knight.setWeapon(new AxeBehavior());
        knight.fight();
        
        Troll troll = new Troll();
        troll.setWeapon(new ClubBehavior());
        troll.fight();
    }
}
