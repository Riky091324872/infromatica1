public class Array2 {
    public static void main(String[] args) {
        int[] numeri = {15, 22, 8, 31, 42, 10, 5, 18, 35};

        
        int somma = 0;
        int minimo = numeri[0];
        int massimo = numeri[0];

        for (int numero : numeri) {
            somma += numero;
            if (numero < minimo) {
                minimo = numero;
            }
            if (numero > massimo) {
                massimo = numero; 
            }
        }

        double media = (double) somma / numeri.length;

        System.out.println("Media degli elementi: " + media);
        System.out.println("Valore minimo: " + minimo);
        System.out.println("Valore massimo: " + massimo);
    }
}
