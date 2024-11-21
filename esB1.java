import java.util.Random;
import java.util.Scanner;

public class esB1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) + 1;
        }

        System.out.print("Array generato: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Inserisci il numero target: ");
        int target = scanner.nextInt();

        System.out.println("Coppie trovate:");
        boolean coppiaTrovata = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("(" + array[i] + ", " + array[j] + ")");
                    coppiaTrovata = true;
                }
            }
        }

        if (!coppiaTrovata) {
            System.out.println("Nessuna coppia trovata.");
        }

        scanner.close();
    }
}
