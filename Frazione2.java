public class Frazione2 {
    private int numeratore;
    private int denominatore;

    public Frazione2() {
        numeratore = 0;
        denominatore = 1;
    }

    public void impostaFrazione(int num, int den) {
        numeratore = num;
        if (den != 0) {
            denominatore = den;
        } else {
            System.out.println("Errore: il denominatore non può essere zero.");
            denominatore = 1; // Default to 1 to avoid zero denominator
        }
    }

    public void semplifica() {
        int mcd = calcolaMCD(numeratore, denominatore);
        numeratore = numeratore / mcd;
        denominatore = denominatore / mcd;
    }

    private int calcolaMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void stampaFrazione() {
        System.out.println(numeratore + "/" + denominatore);
    }

    public static void main(String[] args) {
        Frazione2 f = new Frazione2(); // Changed to Frazione2
        f.stampaFrazione();
    }
}
