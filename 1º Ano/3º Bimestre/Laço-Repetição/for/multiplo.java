public class multiplo {
    public static void main(String[] args) {
        int i;
        for (i=1; i<=100; i++) {
            System.out.println(i);
            if (i%10 == 0) {
                System.out.println("( " +i +" é multiplo de 10 " + ")");
            }
        }
    }
}
