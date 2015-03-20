/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

/**
 *
 * @author Ibn Yahya
 */
public class R1 {
    
    public String[] menu = {"Pepperoni 2.9","Kosher Kebab  10.0","Italiano  5.0"};  
    
    public Iterator createIterator(){
        return new R1Iterator();
    }
    private class R1Iterator implements Iterator{
        
        int index;
        @Override
        public Object next() {
            if(this.hasNext()){
                return menu[index++];
            }else 
                return null;
        }

        @Override
        public boolean hasNext() {
             
            if(index < menu.length)
                return true;
            else 
                return false;
        }
        
    }
    
}
