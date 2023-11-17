package vetoresHard;
import java.util.Scanner;
public class impar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=20;
		int a[], b[], i, j=0;
		a = new int[TAM];
		b = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Diga o " + (i+1) + "° número.");
			a[i] = ler.nextInt();
			if (a[i] % 2 == 0) {
				b[j] = a[i];
				j++;
			}
		}
		for (j, j)
			
		System.out.println(b[i]);
		
	}
}
