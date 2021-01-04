import java.io.*;
import java.util.Scanner;

public class Exceptions {
    /*Hvad er Throws?
    * Try/Catch
    * Hvornår vil man håndtere en fejl i catch og hvornår smider man den videre?*/
    public static void main(String[] args) {
        tryCatchWithFinally();
        try {
            System.out.println("Import file method with throws: ");
            importFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void tryCatchWithFinally() {
        FileInputStream inputStream = null;
        try {
            File file = new File("src/main/java/tmp.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("'finally' Will always be executed");
        }
    }

    public static void importFile() throws FileNotFoundException {
        File file = new File("src/main/java/tmp.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
