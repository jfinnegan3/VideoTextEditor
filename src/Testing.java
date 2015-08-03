/**
 * Created by Jake on 8/3/2015.
 */
import java.io.*;
import java.util.Scanner;


public class Testing {

    public static void main (String[] args) {



        int counter = 0;
        while (counter < 10000000) {
            try {
                File joe = new File("EditThis.txt");
                Scanner scanner = new Scanner(joe);
                while (scanner.hasNext()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

}
