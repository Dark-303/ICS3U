package FileInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringExampleTwo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("strings2.in"));
        while(in.hasNext()) {
            String s = in.next();
            System.out.println(s);
        }
        in.close();
    }
}