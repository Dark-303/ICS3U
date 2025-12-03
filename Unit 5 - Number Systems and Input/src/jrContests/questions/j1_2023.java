package jrContests.questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class j1_2023 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/jrContests/inputs/j1_2023.in"));
        int F = 0;
        int P = in.nextInt();
        int C = in.nextInt();
        F += P * 50 - C * 10;
        if (P > C) F += 500;
        System.out.println(F);
        in.close();
    }
}
