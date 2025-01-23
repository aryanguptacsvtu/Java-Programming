import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling1 {
    public static void main(String[] args) {

        File myFile = new File("Demo.txt");

        // Creating a FILE :-

        try {
            myFile.createNewFile();
            System.out.println("File created successfully...");
        } catch (IOException ex) {
            System.out.println("Sorry!File is not created...");
        }

        // Writing to a FILE :-

        try (FileWriter fw = new FileWriter("Demo.txt")) {
            fw.write("This is our first file.\nLearning about File Handling.");
            fw.write("This is the content written to the file.");
            fw.close();
            System.out.println("File contents written successfully...\n");
        } catch (IOException ex) {
            System.out.println("Sorry!Writing to the file failed...");
        }

        // Reading from a FILE :-

        try (Scanner sc = new Scanner(myFile)) {

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            System.out.println("\nFile contents read successfully...");
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Sorry!Reading from the file failed...");
        }

        // Deleting the FILE :-

        /*
        if (myFile.delete()) {
            System.out.println("\nThe file " + myFile.getName() + " is Deleted...");
        } else {
            System.out.println("Sorry!File deletion failed...");
        }*/
    }
}
