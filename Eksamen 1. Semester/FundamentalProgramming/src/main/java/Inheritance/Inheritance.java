package Inheritance;
/*D-R-Y Principle: Don't repeat yourself. Inheritance is the key to this. It builds on reuseability.
*
1. super can be used to refer immediate parent class instance variable.
2. super can be used to invoke immediate parent class method.
3. super() can be used to invoke immediate parent class constructor. */
interface Animal{

}

class Mammal implements Animal{
    private String eats;
    private boolean vegetarian;
    private int noOfLegs;
    public int test = 10;

    public Mammal(String eats, boolean vegetarian, int noOfLegs) {
        this.eats = eats;
        this.vegetarian = vegetarian;
        this.noOfLegs = noOfLegs;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}

class Dog extends Mammal { //Subclass that inherits from mammal class
    private String color;

    public Dog(String eats, boolean vegetarian, int noOfLegs, String color) {
        super(eats, vegetarian, noOfLegs);
        this.color = color;
        System.out.println(super.test);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Mammal m = new Mammal("food",false,4);
        Dog labrador = new Dog("meat",false,4,"black");

        System.out.println("Mammal instance of animal: " + (m instanceof Animal));
        System.out.println("labrador instance of Mammal: " + (labrador instanceof Mammal));
        System.out.println("labrador instance of animal: " + (labrador instanceof Animal));

        System.out.println("labrador is Vegetarian? " + labrador.isVegetarian());
        System.out.println("labrador eats " + labrador.getEats());
        System.out.println("labrador has " + labrador.getNoOfLegs() + " legs.");
        System.out.println("labrador color is " + labrador.getColor());
    }
}
