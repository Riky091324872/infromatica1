public class Array1 {
    public static void main(String[] args) {
        int[] numeri = new int[10];
        
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = i + 1; 
        }
        
        for (int numero : numeri) {
            System.out.print(numero + " ");
        }
    }
}
