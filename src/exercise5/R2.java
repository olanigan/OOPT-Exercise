/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

import java.util.ArrayList;

/**
 *
 * @author Ibn Yahya
 */
public class R2 {
   
    public ArrayList<String> menu = new ArrayList<String>();
   //Constructor class 
   R2(){
       
    menu.add("Beef&Rice 20.0");
    menu.add("Rice&Chicken 25.0");
    menu.add("Pepperoni 15.0");
    menu.add("Turkey Burger 10.5");
  
    
    } 
   
    public Iterator createIterator(){
        return new R2Iterator();
    }
    private class R2Iterator implements Iterator{
        
        int index;
        
        @Override
        public Object next() {
            if(this.hasNext()){
                return menu.get(index);
            }
                return null;
        }

        @Override
        public boolean hasNext() {
             
            if(index < menu.size())
                return true;
            
                return false;
        }
        
    }
}
