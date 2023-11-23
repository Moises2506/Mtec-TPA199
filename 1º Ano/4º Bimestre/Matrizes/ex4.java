import java.util.Random;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Random ram = new Random();
        Scanner ler = new Scanner(System.in);
        int matriz[][] = new int[4][4], nmr = 0, numero_Jogador = 0, acertos = 0;
        int i = 0, j = 0, k = 0; // i = linha, j = coluna, k = Rodadas Jogadas, ;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                nmr = ram.nextInt(75) + (01);
                matriz[i][j] = nmr;
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        for (k = 0; k <= 1000; k++) {
            System.out.println("Digite o seu número da sorte");
            numero_Jogador = ler.nextInt();
            for (i = 0; i < 4; i++) {
                for (j = 0; j < 4; j++) {
                    if (numero_Jogador == matriz[i][j]) {
                        acertos++;
                        System.out.println("Acertou");
                    } else if (acertos == 16) {
                        System.out.println("Bingoo!");
                    }
                }
            }

        }

    }
}
