import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leggi la stringa in input
        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine();
        
        // 1. Stampa la lunghezza della stringa
        int lunghezza = input.length();
        System.out.println("Lunghezza della stringa: " + lunghezza);
        
        // 2. Stampa il carattere in posizione centrale
        char carattereCentrale = input.charAt(lunghezza / 2);
        System.out.println("Carattere centrale: " + carattereCentrale);
        
        // 3. Conta il numero di occorrenze della lettera 'a' o 'A'
        int conteggioA = 0;
        for (int i = 0; i < lunghezza; i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'A') {
                conteggioA++;
            }
        }
        System.out.println("Numero di occorrenze della lettera 'a': " + conteggioA);
        
        // 4. Stampa la sotto stringa dal primo al quarto carattere (esclusivo)
        String sottoStringa = input.substring(0, Math.min(4, lunghezza)); // Protegge da errori se la stringa è troppo corta
        System.out.println("Sottostringa dal primo al quarto carattere: " + sottoStringa);
        
        // 5. Stampa la stringa in maiuscolo e minuscolo
        System.out.println("Stringa in maiuscolo: " + input.toUpperCase());
        System.out.println("Stringa in minuscolo: " + input.toLowerCase());
        
        scanner.close();
    }
}