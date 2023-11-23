import java.util.Scanner;

public class futebol {
    public static void main(String[] args) {
        //EXERCICIO 01
        Scanner ler = new Scanner(System.in);
        int id;
        System.out.println("Digite a idade do participantte:");
        id = ler.nextInt();

        switch (id) {
            case 6:
                System.out.println("Sua Categoria é: Dente de Leite");
                break;
            case 7:
                System.out.println("Sua categoria é: Júnior");
                break;
            case 8:
                System.out.println("Sua categoria é: Júnior Max");
                break;
            case 9:
                System.out.println("Sua categoria é: Júnior Master");
                break;
            case 10:
                System.out.println("Sua categoria é: Master");
                break;
            default:
                System.out.println("Não existe categoria para essa idade");
                break;
        }
        ler.close();


    }
}
