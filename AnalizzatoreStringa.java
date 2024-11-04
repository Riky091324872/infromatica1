import java.util.Scanner;

public class AnalizzatoreStringa {
    
    public static boolean isPalindromo(String str) {
        // Rimuove gli spazi e converte la stringa in minuscolo
        String cleanedString = str.replaceAll("\\s+", "").toLowerCase();
        int lunghezza = cleanedString.length();

        // Controlla se la stringa è palindroma
        for (int i = 0; i < lunghezza / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(lunghezza - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine();
        
        // Lunghezza della stringa
        int lunghezza = input.length();
        System.out.println("Lunghezza della stringa: " + lunghezza);

        // Carattere centrale o caratteri centrali
        int centro = lunghezza / 2;
        if (lunghezza % 2 == 1) {
            System.out.println("Carattere centrale: " + input.charAt(centro));
        } else {
            System.out.println("La stringa ha due caratteri centrali: " + input.charAt(centro - 1) + " e " + input.charAt(centro));
        }

        // Prima lettera maiuscola
        if (lunghezza > 0) {
            String capitalized = input.substring(0, 1).toUpperCase() + input.substring(1);
            System.out.println("Stringa con iniziale maiuscola: " + capitalized);
        }

        // Conta occorrenze del carattere 'a' o 'A'
        long occorrenzeA = input.chars().filter(c -> c == 'a' || c == 'A').count();
        System.out.println("Numero di occorrenze del carattere 'a': " + occorrenzeA);

        // Sottostringa dai primi 4 caratteri, se la lunghezza lo consente
        if (lunghezza >= 4) {
            System.out.println("Sottostringa dal primo al quarto carattere: " + input.substring(0, 4));
        } else {
            System.out.println("La stringa è troppo corta per avere una sottostringa dal primo al quarto carattere.");
        }

        // Stringa in maiuscolo e minuscolo
        System.out.println("Stringa in maiuscolo: " + input.toUpperCase());
        System.out.println("Stringa in minuscolo: " + input.toLowerCase());

        // Controllo se la stringa è un palindromo
        if (isPalindromo(input)) {
            System.out.println("La stringa è un palindromo.");
        } else {
            System.out.println("La stringa non è un palindromo.");
        }

        scanner.close();
    }
}
