package FileInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class j2_2023 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("j2_2023.in"));

        int N = in.nextInt();
        int SHU = 0;

        for (int i = 0; i <= N; i++) {
            String pepper = in.nextLine();
            switch(pepper) {
                case "Poblano":
                    SHU += 1500;
                    break;
                case "Mirasol":
                    SHU += 6000;
                    break;
                case "Serrano":
                    SHU += 15500;
                    break;
                case "Cayenne":
                    SHU += 40000;
                    break;
                case "Thai":
                    SHU += 75000;
                    break;
                case "Habanero":
                    SHU += 125000;
                    break;
                default:
                    break;
            }
        }
        System.out.println(SHU);
        in.close();
    }
}
