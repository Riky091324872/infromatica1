import java.util.Scanner;

public class Es8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci il primo numero (dividendo): ");
            int num1 = scanner.nextInt();

            System.out.print("Inserisci il secondo numero (divisore): ");
            int num2 = scanner.nextInt();
            int risultato = num1 / num2;

            System.out.println("Il risultato della divisione è: " + risultato);

            System.out.print("Inserisci un indice per l'array: ");
            int indice = scanner.nextInt();
            int[] array = {10, 20, 30};
            System.out.println("Elemento all'indice " + indice + ": " + array[indice]);
        } catch (ArithmeticException e) {
            System.out.println("Errore: Divisione per zero non consentita.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: Indice fuori dai limiti dell'array.");
        } catch (Exception e) {
            System.out.println("Errore imprevisto: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
