package framing.question;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FramingSquares {
    public static void main(String[] args) throws FileNotFoundException {
        FramingSquares picture = new FramingSquares(new Scanner(new File("src/framing/inputs/DATA11.in")));
        picture.frameLoop();
    }



















    










    private int M;
    private int N;
    private int P;
    private int Q;
    private final Scanner in;

    public FramingSquares(int M, int N, int P, int Q) {
        in = null;

        this.M = M;
        this.N = N;
        this.P = P;
        this.Q = Q;
    }

    public FramingSquares(Scanner in) {
        this.in = in;
    }

    public void findValues() {
        M = in.nextInt();
        N = in.nextInt();
        P = in.nextInt();
        Q = in.nextInt();
    }

    public void calculateTopFrame() {
        for (int i = 0; i < Q; i++) {
            for (int j = 0; j < (2*Q+2*P+N); j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        for (int i = 0; i < P; i++) {
            for (int j = 0; j < Q; j++) {
                System.out.print("#");
            }
            for (int j = 0; j < (2*P+N); j++) {
                System.out.print("+");
            }
            for (int j = 0; j < Q; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public void calculateBottomFrame() {
        for (int i = 0; i < P; i++) {
            for (int j = 0; j < Q; j++) {
                System.out.print("#");
            }
            for (int j = 0; j < (2*P+N); j++) {
                System.out.print("+");
            }
            for (int j = 0; j < Q; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        
        for (int i = 0; i < Q; i++) {
            for (int j = 0; j < (2*Q+2*P+N); j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public void calculateImage() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < Q; j++) {
                System.out.print("#");
            }
            for (int j = 0; j < P; j++) {
                System.out.print("+");
            }
            for (int j = 0; j < N; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < P; j++) {
                System.out.print("+");
            }
            for (int j = 0; j < Q; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public void calculateFrame() {
        calculateTopFrame();
        calculateImage();
        calculateBottomFrame();
    }

    public void frameLoop() {
        while (in.hasNext()) {
            findValues();
            calculateFrame();
            System.out.println();
            System.out.println();
        }

        in.close();
    }
}
