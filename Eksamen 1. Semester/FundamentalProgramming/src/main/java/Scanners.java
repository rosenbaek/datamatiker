import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {


        /*System.out.println("indtast kundens navn: ");
        String navn = scan.nextLine();*/


        System.out.println(getInt());
        System.out.println(getDouble());


        //System.out.println("Kundens navn: " + navn);
    }

    private static int getInt() {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        try {
            System.out.println("indtast integer: ");
            x = scan.nextInt();
            return x;

        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Forkert Datatype");
            getInt(); //recursion
        }
        return x;
    }

    private static double getDouble() {
        Scanner scan = new Scanner(System.in);
        double x = 0;
        try {
            System.out.println("indtast Double: ");
            x = scan.nextDouble();
            return x;

        } catch (InputMismatchException e) {
            e.printStackTrace();
            getDouble(); // recursion
        }
        return x;
    }
}
