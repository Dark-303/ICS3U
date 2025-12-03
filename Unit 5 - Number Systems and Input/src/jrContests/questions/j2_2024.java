package jrContests.questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class j2_2024 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/jrContests/inputs/j2_2024.in"));

        int D = in.nextInt();
        int R = 0;

        while (in.hasNext()) {
            int Y = in.nextInt();
            if (D > Y) D += Y;
            else{ 
                R = D;
                break;
            }
        }
        System.out.println(R);
        in.close();
    }
}
