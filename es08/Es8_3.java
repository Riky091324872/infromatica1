import java.util.Scanner;

class EtàNonValidaException extends Exception {
    public EtàNonValidaException(String message) {
        super(message);
    }
}

public class Es8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci la tua età: ");
            int età = scanner.nextInt();

            if (età < 0) {
                throw new EtàNonValidaException("Errore: l'età non può essere negativa.");
            }

            System.out.println("La tua età è: " + età);
        } catch (EtàNonValidaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore: Inserimento non valido.");
        } finally {
            scanner.close();
        }
    }
}
