import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Activity5_2 {
    public static void main(String[] args) {
        String s = "a.txt";
        readTextFile(s);
    }
    public static void readTextFile(String a) {
        String s;
        try {
            File myFile = new File(a);
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                s = sc.nextLine();
                System.out.println(s);
                // loop to read entire file
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Your file is not found");
        }
    }
}
