import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[];
		final int TAM = 10;
		a = new int[TAM];
		b = new int[TAM];
		for (int i=0; i<TAM; i++) {
			System.out.println("Diga o " + (i+1) + "° valor de a");
			a[i] = in.nextInt();
			b[i] = a[i] * a[i];			
		}
		System.out.println("");
		for (int i=0; i<TAM; i++) {
			System.out.println("O " + (i+1) + " valor de b é: " + b[i]);
		}
		in.close();
	}

}
