
package exercise11;

/**
 *
 * @author Ibrahim Olanigan
 */
public class Factory extends FactoryBuilder{

    @Override
    public Dog CreateDog(String number) {
        if(number.equals("2"))
            return new Breed2();
        else if(number.equals("3"))
            return new Breed3();
        
        return new Breed1(); //Default Breed
        }
    
    public static void main(String[] args) {
        Factory fact = new Factory();
        Dog dog1 = fact.CreateDog("1");
        Dog dog2 = fact.CreateDog("2");
        Dog dog3 = fact.CreateDog("3");
        Dog dog4 = fact.CreateDog("0");
        
        dog1.bark();
        dog2.bark();
        dog3.bark();
        dog4.bark();
    }
}
