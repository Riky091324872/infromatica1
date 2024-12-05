import java.util.Random;
import java.util.Scanner;

public class BattagliaNavale {
    public static void main(String[] args) {
        int[][] griglia = new int[5][5];
        int navi = 5;
        int tentativi = 10;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (navi > 0) {
            int riga = random.nextInt(5);
            int colonna = random.nextInt(5);
            if (griglia[riga][colonna] == 0) { 
                griglia[riga][colonna] = 1;
                navi--;
            }
        }

        System.out.println("Benvenuto a Battaglia Navale! Hai 10 tentativi per colpire 5 navi.");
        int colpite = 0;

        while (tentativi > 0 && colpite < 5) {
            System.out.print("Inserisci la riga (0-4): ");
            int riga = scanner.nextInt();
            System.out.print("Inserisci la colonna (0-4): ");
            int colonna = scanner.nextInt();

            if (riga < 0 || riga >= 5 || colonna < 0 || colonna >= 5) {
                System.out.println("Coordinate fuori griglia. Riprova!");
                continue;
            }

            if (griglia[riga][colonna] == 1) {
                System.out.println("Colpito!");
                griglia[riga][colonna] = -1; 
                colpite++;
            } else if (griglia[riga][colonna] == 0) {
                System.out.println("Acqua!");
                griglia[riga][colonna] = -2; 
            } else {
                System.out.println("Hai già sparato qui! Riprova.");
            }
            tentativi--;
            System.out.println("Tentativi rimanenti: " + tentativi);
        }
        if (colpite == 5) {
            System.out.println("Complimenti! Hai colpito tutte le navi!");
        } else {
            System.out.println("Tentativi esauriti. Gioco finito.");
        }
        System.out.println("\nGriglia finale:");
        for (int i = 0; i < griglia.length; i++) {
            for (int j = 0; j < griglia[i].length; j++) {
                if (griglia[i][j] == 1) {
                    System.out.print(" 1 "); 
                } else if (griglia[i][j] == -1) {
                    System.out.print("-1 "); 
                } else if (griglia[i][j] == -2) {
                    System.out.print("-2 "); 
                } else {
                    System.out.print(" 0 "); 
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
