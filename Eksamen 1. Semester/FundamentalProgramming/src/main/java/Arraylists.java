import java.util.ArrayList;

public class Arraylists {

    private static ArrayList<Integer> lists = new ArrayList<Integer>(); //Declaring and instanciate

    //Arraylist er smart fordi du behøver ikke at lave en specifik størrelse inden du putter data ind. Det skal du med et alm array.
    /*First of all Declaring mean:
    ClassName obj;
    Simple meaning of instantiate is creating an object from class.
    ClassName obj = new ClassName();*/

    public static void main(String[] args) {
        int a = 1;
        lists.add(a);
        a = 2;
        lists.add(a);

        System.out.println("Size: " + lists.size()); //Check size of arraylist

        System.out.println("contains 2: " + lists.contains(2)); // Check if Arraylist Contains object

        System.out.println("Index of 2: " + lists.indexOf(2)); // Check index of object

        System.out.println("Get object: " + lists.get(0)); // get object via index

        System.out.println(lists.toString());
    }
}
