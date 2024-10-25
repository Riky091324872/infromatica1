public class numeri {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Per favore, fornisci una sequenza di numeri reali.");
            return;
        }

        double somma = 0;
        double massimo = Double.NEGATIVE_INFINITY;
        double minimo = Double.POSITIVE_INFINITY;

        for (String arg : args) {
            try {
                double numero = Double.parseDouble(arg);
                somma += numero;

                if (numero > massimo) {
                    massimo = numero;
                }
                if (numero < minimo) {
                    minimo = numero;
                }
            } catch (NumberFormatException e) {
                System.out.println("Assicurati che tutti gli argomenti siano numeri reali.");
                return;
            }
        }

        double media = somma / args.length;
        
        System.out.println("Somma: " + somma);
        System.out.println("Media: " + media);
        System.out.println("Massimo: " + massimo);
        System.out.println("Minimo: " + minimo);
    }
}
