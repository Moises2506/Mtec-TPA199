package tpa_0206;
import java.util.Scanner;
public class ingresso {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double ing;
		String resp;
		System.out.println("Qual é o valor do ingresso?");
		ing = ler.nextDouble();
		System.out.println("Você é estudante? Responda com Sim ou não");
		resp = ler.next();
		if (resp.equalsIgnoreCase("Sim")) {
			ing=(ing/100)*50;
			System.out.println("Você deve pagar: " + ing);
		}else {
			System.out.println("Você deve pagar: " + ing);
		}
	}
}
