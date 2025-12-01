package FileInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringExampleThree {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("strings2.in"));
        while(in.hasNext()) {
            String s = in.nextLine();
            String[] words = s.split(" ");
            for (int i = 0; i <= words.length-1; i++)
            System.out.println(words[i]);
        }
        in.close();
    }
}