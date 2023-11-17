public class ex1 {
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int i = 0, j = 0, nmr = 2; // i = linha e j = coluna
        for(i = 0; i <4; i++) {
            for(j = 0; j < 4; j++) {
				matriz [i][j] = nmr;
                nmr = nmr *2;
                System.out.print("[" + nmr + "]");
            }
            System.out.println("");
        }
        
           
    }
}
