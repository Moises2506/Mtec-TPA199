
import java.util.Scanner;
public class peso {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String sexo; //Masculino e Feminino
		int alt, resp;
		double peso, pesoId;// peso: peso informado, pesoId: peso Ideal
		do {
			System.out.println("Seu sexo � masculino ou feminino?");
			sexo = ler.next();
			System.out.println("Quanto voc� pesa?");
			peso = ler.nextDouble();
			System.out.println("qual a sua altura?");
			alt = ler.nextInt();

			if (sexo.equalsIgnoreCase("masculino")) {
			    pesoId = 52 + (0.75 * (alt -152.4));
			    System.out.printf("Seu peso ideal deve ser: %.2f\\n" + " " + pesoId);
			    if (peso > pesoId *2) {
					System.out.println("Recomendo que procure um m�dico especializado");
				}
			} else if (sexo.equalsIgnoreCase("feminino")) {
			    pesoId  = 52 + (0.67 * (alt - 152.4));
			    System.out.printf("Seu peso ideal deve ser: %.2f\n", pesoId);
			    if (peso > pesoId *2) {
					System.out.println("Recomendo que procure um m�dico especializado");
				}
			}
			
			System.out.println("Deseja continuar? 1 = sim 2 = n�o");
			resp = ler.nextInt();
		} while (resp == 1);
		ler.close();
	}
}