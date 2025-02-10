public class Es8_7 {
    public static void main(String[] args) {
        try {
            causaStackOverflow();
        } catch (StackOverflowError e) {
            System.out.println("Errore: StackOverflow rilevato! La ricorsione è andata troppo in profondità.");
        }
    }

    public static void causaStackOverflow() {
        causaStackOverflow();
    }
}
