import java.util.Scanner;

public class AnalizzatoreStringa {
    
    public static boolean isPalindromo(String str) {
        String cleanedString = str.replaceAll("\\s+", "").toLowerCase();
        int lunghezza = cleanedString.length();

        for (int i = 0; i < lunghezza / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(lunghezza - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String input = scanner.nextLine();
        
        System.out.println("Lunghezza della stringa: " + input.length());

        int centro = input.length() / 2;
        if (input.length() % 2 == 1) {
            System.out.println("Carattere centrale: " + input.charAt(centro));
        } else {
            System.out.println("La stringa ha due caratteri centrali: " + input.charAt(centro - 1) + " e " + input.charAt(centro));
        }

        if (input.length() > 0) {
            String capitalized = input.substring(0, 1).toUpperCase() + input.substring(1);
            System.out.println("Stringa con iniziale maiuscola: " + capitalized);
        }

        long occorrenzeA = input.chars().filter(c -> c == 'a' || c == 'A').count();
        System.out.println("Numero di occorrenze del carattere 'a': " + occorrenzeA);

        if (input.length() >= 4) {
            System.out.println("Sottostringa dal primo al quarto carattere: " + input.substring(0, 4));
        } else {
            System.out.println("La stringa è troppo corta per avere una sottostringa dal primo al quarto carattere.");
        }

        System.out.println("Stringa in maiuscolo: " + input.toUpperCase());

        System.out.println("Stringa in minuscolo: " + input.toLowerCase());

        if (isPalindromo(input)) {
            System.out.println("La stringa è un palindromo.");
        } else {
            System.out.println("La stringa non è un palindromo.");
        }

        scanner.close();
    }
}
