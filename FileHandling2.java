// Program to write the multiplication table of a number to a file :-
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling2 {
    public static void main(String[] args) {

        File myFile = new File("Table.txt");
        int num;
        String table = "";

        try {
            myFile.createNewFile();
            System.out.println("File created successfully...");
        } catch (IOException ex) {
            System.out.println("Sorry!File is not created...");
        }

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter the no. whose table you want : ");
            num = sc.nextInt();

            for (int i = 1; i < 11; i++) {
                table += num + " X " + i + " = " + (num * i);
                table += "\n";
            }
        }

        try (FileWriter fw = new FileWriter("Table.txt")) {
            fw.write("---Multiplication table of " + num + "---\n\n");
            fw.write(table);
            fw.close();
            System.out.println("File contents written successfully...\n");
        } catch (IOException ex) {
            System.out.println("Sorry!Writing to the file failed...");
        }
    }

}
