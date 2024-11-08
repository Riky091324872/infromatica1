public class Frazione2 {
    private int numeratore;
    private int denominatore;

    public Frazione2() {
        numeratore = 0;
        denominatore = 1;
    }

    public Frazione2(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = (denominatore != 0) ? denominatore : 1;
    }

    public void semplifica() {
        int mcd = calcolaMCD(numeratore, denominatore);
        numeratore /= mcd;
        denominatore /= mcd;
    }

    private int calcolaMCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public String toString() {
        return numeratore + "/" + denominatore;
    }

    public static void main(String[] args) {
        Frazione2 frazione1 = new Frazione2();
        System.out.println("Frazione iniziale: " + frazione1);

        Frazione2 frazione2 = new Frazione2(8, 12);
        System.out.println("Frazione non semplificata: " + frazione2);
        
        frazione2.semplifica();
        System.out.println("Frazione semplificata: " + frazione2);
    }
}
