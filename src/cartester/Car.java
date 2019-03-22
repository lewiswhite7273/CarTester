
package cartester;

/**
 *
 * @author lewhi7273
 */
public class Car {
    
    private String make, model;
    private int year, price, numberOfSeats, amountMade;
    
    
   //create default constructor
    public Car(){
        make = "Standard Motor Company";
        model = "Triumph Mayflower";
        amountMade = 35000;
        year = 1949;
        price = 3400;
        numberOfSeats = 4;
    }
        
        /**
         * @param mke, mdl
         * @param yr, prce, nOS, aM
         */
    public Car(String mke, String mdl, int yr, int prce, int nOS, int aM){
        mke = make;
        mdl = model;
        yr = year;
        prce = price;
        nOS = numberOfSeats;
        aM = amountMade;
    }
    public Car(int prce, int yr, int nOS, int aM){
        make = "Toyota";
        model = "Camry";
        nOS = numberOfSeats;
        aM = amountMade;
        prce = price;
        yr = year;
        
    //one car will honk the horn
    } 
    public void honked(){
        System.out.println("HONKKKKKK!!!");
    
    }
    public String toString(){
        String output = "Make: " + make + "\n";
    output += "Model: " + model + "\n";
    output += "Price: $" + price + "\n";
    output += "Year: " + year + "\n";
    output += "Amount Made: "+amountMade+"\n";
    output += "Number of Seats: "+numberOfSeats;
    //output string is complete, return it
    
    return output;
    }
    
}
