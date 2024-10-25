public class Frazione
 {

    public int sottrai(int a, int b) {
        return a - b;
    }

    public int moltiplica(int a, int b) {
        return a * b;
    }

    public int dividi(int a, int b) {
        if (b == 0) {
            System.out.println("Non puoi dividere per zero");
            return 0; 
        }
        return (double) a / b; 
    }

    public static void main(String[] args) {
        Frazione calc = new Frazione();

        System.out.println("Sottrazione (10 - 5): " + calc.sottrai(10, 5));        
        System.out.println("Moltiplicazione (10 * 5): " + calc.moltiplica(10, 5)); 
        System.out.println("Divisione (10 / 2): " + calc.dividi(10, 2));           
        System.out.println("Divisione (10 / 0): " + calc.dividi(10, 0));           
    }
}
