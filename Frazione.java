public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    public Frazione sottrai(Frazione f) {
        int num = this.numeratore * f.denominatore - f.numeratore * this.denominatore;
        int den = this.denominatore * f.denominatore;
        return new Frazione(num, den);
    }

    public Frazione moltiplica(Frazione f) {
        int num = this.numeratore * f.numeratore;
        int den = this.denominatore * f.denominatore;
        return new Frazione(num, den);
    }

    public Frazione dividi(Frazione f) {
        int num = this.numeratore * f.denominatore;
        int den = this.denominatore * f.numeratore;
        return new Frazione(num, den);
    }

    public String toString() {
        return numeratore + "/" + denominatore;
    }

    public static void main(String[] args) {
        Frazione f1 = new Frazione(3, 4); // 3/4
        Frazione f2 = new Frazione(2, 5); // 2/5

        System.out.println("Sottrazione: " + f1.sottrai(f2));
        System.out.println("Moltiplicazione: " + f1.moltiplica(f2));
        System.out.println("Divisione: " + f1.dividi(f2));
    }
}
