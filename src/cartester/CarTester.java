/*
 * Lewis White
 * March 22, 2019
 * This program will allow users to input car statistics
 */

package cartester;

/**
 *
 * @author lewhi7273
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Car car1 = new Car();
        Car car2 = new Car("Lamborghini", "Aventador", 2011, 443804,2,5000);
        Car car3 = new Car(26000, 1982, 5, 6000000);
        
        
        //print the details of each car
        System.out.println(car1.toString());
        System.out.println("------------------------");
        
        System.out.println(car2.toString());
        System.out.println("------------------------");
        
        System.out.println(car3.toString());
        System.out.println("------------------------");
        
        
       car2.honked();
    }
    
}
