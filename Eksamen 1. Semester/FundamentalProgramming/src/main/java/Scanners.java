import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {

        System.out.println(getInt());
        System.out.println(getDouble());

        importFile();
    }

    private static int getInt() {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        try {
            System.out.println("indtast integer: ");
            return scan.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Forkert Datatype");
        }
        return getInt(); //recursion
    }


    private static double getDouble() {
        Scanner scan = new Scanner(System.in);
        double x = 0;
        try {
            System.out.println("indtast Double: ");
            return scan.nextDouble();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return getDouble(); // recursion
    }

    public static void importFile(){
        try {
            File file = new File("filename.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
