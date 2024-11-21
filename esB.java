import java.util.Random;
import java.util.Scanner;

public class esB {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        int posizioneSegreta = random.nextInt(array.length);
        int numeroSegreto = array[posizioneSegreta];

        System.out.println("Indovina il numero nella posizione segreta dell'array (tra 1 e 100):");

        int tentativo;
        do {
            tentativo = scanner.nextInt();
            if (tentativo < numeroSegreto) {
                System.out.println("Troppo basso!");
            } else if (tentativo > numeroSegreto) {
                System.out.println("Troppo alto!");
            } else {
                System.out.println("Hai indovinato!");
            }
        } while (tentativo != numeroSegreto);

        scanner.close();
    }
}
