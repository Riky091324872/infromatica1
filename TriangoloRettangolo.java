public class TriangoloRettangolo {

    public static void main(String[] args) {
        int cateto1 = 3; 
        int cateto2 = 4; 

        double ipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        Thread figlio = new Thread(() -> {
            double perimetro = cateto1 + cateto2 + ipotenusa;
            System.out.println("Il perimetro del triangolo è: " + perimetro);
        });

        figlio.start(); 
        double area = (cateto1 * cateto2) / 2.0;
        System.out.println("L'area del triangolo è: " + area);

        try {
            figlio.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrotto.");
        }
    }
}
