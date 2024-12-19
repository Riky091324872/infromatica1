import java.util.Scanner;

public class LampeggioLED {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comando;

        System.out.println("Comandi disponibili:");
        System.out.println("v -> lampeggio LED verde");
        System.out.println("r -> lampeggio LED rosso");
        System.out.println("g -> lampeggio LED giallo");
        System.out.println("q -> uscire dal programma");

        while (true) {
            System.out.print("Inserisci comando: ");
            comando = scanner.nextLine();

            if (comando.equals("q")) {
                System.out.println("Chiusura del programma...");
                break;
            }

            int intervallo = 0;
            String colore = "";

            if (comando.equals("v")) {
                intervallo = 300; // 0.3 secondi
                colore = "verde";
            } else if (comando.equals("r")) {
                intervallo = 700; // 0.7 secondi
                colore = "rosso";
            } else if (comando.equals("g")) {
                intervallo = 1200; // 1.2 secondi
                colore = "giallo";
            } else {
                System.out.println("Comando non riconosciuto. Riprova.");
                continue;
            }

            // Processo figlio simulato
            lampeggiaLED(colore, intervallo);
        }

        scanner.close();
    }

    private static void lampeggiaLED(String colore, int intervallo) {
        for (int i = 0; i < 10; i++) {
            System.out.println("LED " + colore + " acceso");
            dormi(intervallo);
            System.out.println("LED " + colore + " spento");
            dormi(intervallo);
        }
        System.out.println("Lampeggio LED " + colore + " completato.");
    }

    private static void dormi(int millisecondi) {
        try {
            Thread.sleep(millisecondi);
        } catch (InterruptedException e) {
            System.out.println("Errore durante l'attesa.");
        }
    }
}
