import java.util.Random;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Random in = new Random();
        Scanner ler = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int i = 0, j = 0, maior = 0, menor = 1000;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                matriz[i][j] = nmr;
                nmr = nmr * 2;
                System.out.print("[" + nmr + "]");
            }
            System.out.println("");
        }
    }
}
