package FileInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SampleFileInput {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("sample.in");
        Scanner in = new Scanner(f);
        while (in.hasNext()) {
            int x = in.nextInt();
            System.out.println(x);
        }
        in.close();
    }
}