import java.util.Random;
public class ex2 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        Random in = new Random();
        int i = 0, j = 0, maior = 0, menor = 1000;// i = linha e j = coluna
        for(i = 0; i <3; i++) {
            for(j = 0; j < 3; j++) {
                int nmr = 0;
				nmr = in.nextInt()%50;
                if(nmr > maior){
                    maior = nmr;
                }
                else if (nmr < menor){
                    menor = nmr;
                }
                System.out.print("[" + nmr + "]");
            }
            System.out.println("");

        }
        System.out.println("Maior:" + maior);
        System.out.println("Menor:" + menor);
        
    }
}