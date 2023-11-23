import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        Random in = new Random();
        int matriz[][] = new int[3][3];
        int i=0, j=0, maior = 0, menor = 1000; //i = Linha  j = coluna
        int linhaMaior = 0, colunaMaior = 0, colunaMenor = 0, linhaMenor = 0; 

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                int nmr = in.nextInt() % 50;
                matriz[i][j] = nmr;

                if (nmr > maior) {
                    maior = nmr;
                    linhaMaior = i;
                    colunaMaior = j;
                } else if (nmr < menor) {
                    menor = nmr;
                    linhaMenor = i;
                    colunaMenor = j;
                }
                System.out.print("[" + nmr + "]");
            }
            System.out.println("");
        }

        System.out.println("Maior: " + maior);
        System.out.println("Sua posição: " + "Linha " + linhaMaior + " Coluna " + colunaMaior );

        System.out.println("Menor: " + menor);
        System.out.println("Sua posição: " + "Linha " + linhaMenor + " Coluna " + colunaMenor );
    }
}
