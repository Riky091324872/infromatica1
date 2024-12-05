import java.util.ArrayList;
import java.util.Random;

public class ListaNumeri {
    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numeri.add(random.nextInt(50) + 1);
        }

        System.out.println("Lista originale: " + numeri);

        numeri.removeIf(n -> n % 2 == 0);

        System.out.println("Lista senza numeri pari: " + numeri);
    }
}
