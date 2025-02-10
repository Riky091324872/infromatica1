import java.util.Scanner;

public class Es8_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroValido;

        while (true) {
            try {
                System.out.print("Inserisci un numero intero: ");
                String input = scanner.nextLine();
                numeroValido = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Errore: Inserisci un numero valido.");
            }
        }

        System.out.println("Numero valido inserito: " + numeroValido);
        scanner.close();
    }
}
