import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        int i, ano, anoid, id, idM = 0, idMN =1200; // idM = Maior idade idMN = Menor idade
        String nome, nomeV = "", nomeN = ""; // nomeV = Nome do + velho nomeN = nome do + novo
        Scanner ler = new Scanner(System.in);
        System.out.println("Em que ano estamos?");
        ano = ler.nextInt();
        for (i = 1; i <= 3; i++) {
            System.out.println("Qual é o seu nome?");
            nome = ler.next();
            System.out.println("Que ano você Nasceu?");
            anoid = ler.nextInt();
            id = ano - anoid;
            if (id > idM) {
                idM = id;
                nomeV = nome;
            } else if (id < idMN) {
                idMN = id;
                nomeN = nome;
            }
            System.out.println(nome + " Tem " + id + " anos");

        }
        System.out.println(nomeV + " é o mais velho");
        System.out.println(nomeN + " é o mais novo");

    }

}
