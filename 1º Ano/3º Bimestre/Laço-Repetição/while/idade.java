import java.util.Scanner;
public class idade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1,id, dMaior=0, dMenor=0;
		while (i<=10) {
			System.out.println("Qual é a sua idade?");
			id = in.nextInt();
			if (id<18) {
				dMaior++;
			}
			i++;
		}
		
		
		
		
	}
}
