package jrContests.questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class j1_2024 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/jrContests/inputs/j1_2024.in"));
        int R = in.nextInt();
        int G = in.nextInt();
        int B = in.nextInt();
        int C = R * 3 + G * 4 + B * 5;
        System.out.println(C);
        in.close();
    }
}
