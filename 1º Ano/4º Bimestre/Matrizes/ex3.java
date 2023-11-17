import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][4];
        Random in = new Random();
        int i = 0, j = 0, soma = 0, numero;// i = linha e j = coluna
        for(i = 0; i < 3; i++){
            soma = 0;
            for(j = 0; j < 4; j++){
                if(j != 3){
                    numero = in.nextInt()%50;
                    matriz[i][j] = numero;
                    soma = soma + numero;
                } else {
                    matriz[i][3] = soma;
                }
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}