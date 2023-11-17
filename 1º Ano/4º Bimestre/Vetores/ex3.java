import java.util.*;

public class ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0, a[], b[];
		final int TAM=10;
		a = new int [TAM];
		b = new int [TAM];
		for (i=0; i<TAM; i++) {
			System.out.println("Diga o " + (i+1) + "° número.");
			a[i] = in.nextInt();
		}
		for (int i2 =0; i2<TAM; i--, i2++) {
			b[i2] = a[i];
			System.out.print(b[i2]);
		}
		in.close();
		
	}
}
