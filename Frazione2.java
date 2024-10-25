public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione() {
        numeratore = 0;
        denominatore = 1;
    }

    public void impostaFrazione(int num, int den) {
        numeratore = num;
        denominatore = den;
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
        Frazione f = new Frazione();
        f.stampaFrazione(); 

    }
}
