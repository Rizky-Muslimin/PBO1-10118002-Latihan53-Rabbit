
package pbo1.pkg10118002.latihan53.rabbit;

/**
 * NAMA  : Rizky Muslimin
 * KELAS : IF 1
 * NIM   : 10118002
 */
public class Animal {
    
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal (boolean vegetarian, String food, int legs){
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }
    
    public boolean isVegetarian(){
        
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
    
    
}
