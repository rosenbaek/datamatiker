import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Filer {
    public static void main(String[] args) {

        try {
            createFile();
            writeToFile();
            //deleteFile();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
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

    public static void createFile() throws IOException {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeToFile() throws IOException {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Her kan man skrive til en text fil.");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void deleteFile(){
        File file = new File("filename.txt");
        if (file.delete()){
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
