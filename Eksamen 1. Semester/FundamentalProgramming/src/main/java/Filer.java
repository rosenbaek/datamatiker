import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filer {
    public static void main(String[] args) {
        try {
            System.out.println("Import file method with throws: ");
            importFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
