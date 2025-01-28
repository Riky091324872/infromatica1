public class Array4 {
    public static void main(String[] args) {
        int[] numeri = {10, 20, 30, 40, 50};
        int n = numeri.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = numeri[i];
            numeri[i] = numeri[n - 1 - i];
            numeri[n - 1 - i] = temp;
        }

        for (int numero : numeri) {
            System.out.print(numero + " ");
        }
    }
}
