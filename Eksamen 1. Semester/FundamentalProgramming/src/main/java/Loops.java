public class Loops {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        // For loop
        for (int i = 0; i < 10; i++){
            System.out.println("for loop: " + i);
        }

        System.out.println();

        //For each
        for (int tmp: arr) { //((1)int (2)i: (3)arr) 1: Datatype af array. 2. tmp variable navn. 3. navn på array
            System.out.println("for each: " + tmp);
        }

        System.out.println();
        //While loop
        int x = 0;
        while (x < 5) { // test expression
            System.out.println("Hello World");

            // update expression
            x++;
        }

    }
}
