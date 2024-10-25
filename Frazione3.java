public class Frazione3 {
    private int numeratore;
    private int denominatore;

    // Costruttore
    public Frazione3(int numeratore, int denominatore) {
        if (denominatore == 0) {
            throw new IllegalArgumentException("Il denominatore non può essere zero.");
        }
        // Riduci la frazione ai minimi termini
        int gcd = gcd(numeratore, denominatore);
        this.numeratore = numeratore / gcd;
        this.denominatore = denominatore / gcd;
        
        // Se il denominatore è negativo, rendiamo il numeratore negativo
        if (this.denominatore < 0) {
            this.numeratore = -this.numeratore;
            this.denominatore = -this.denominatore;
        }
    }

    // Metodo per calcolare il massimo comune divisore
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Metodo che restituisce il reciproco della frazione
    public Frazione3 reciproco() {
        return new Frazione3(this.denominatore, this.numeratore);
    }

    // Metodo che confronta due frazioni
    public int confronta(Frazione3 f) {
        int thisVal = this.numeratore * f.denominatore;
        int otherVal = f.numeratore * this.denominatore;

        if (thisVal > otherVal) {
            return 1;
        } else if (thisVal < otherVal) {
            return -1;
        } else {
            return 0;
        }
    }

    // Metodo che converte la frazione in un numero decimale
    public double toDouble() {
        return (double) this.numeratore / this.denominatore;
    }

    // Metodo che converte una frazione impropria in una frazione mista
    public String toFrazioneMista() {
        if (Math.abs(this.numeratore) < this.denominatore) {
            return this.toString(); // Se è già una frazione propria, ritorna la frazione normale
        } else {
            int intero = this.numeratore / this.denominatore;
            int nuovoNumeratore = Math.abs(this.numeratore % this.denominatore);
            if (nuovoNumeratore == 0) {
                return String.valueOf(intero); // Se non ci sono resti, ritorna solo la parte intera
            } else {
                return intero + " " + nuovoNumeratore + "/" + this.denominatore;
            }
        }
    }

    // Sovrascrittura del metodo toString per stampare correttamente la frazione
    @Override
    public String toString() {
        if (denominatore == 1) {
            return String.valueOf(numeratore);
        }
        return numeratore + "/" + denominatore;
    }

    // Main per testare la classe
    public static void main(String[] args) {
        Frazione3 f1 = new Frazione3(7, 3);
        Frazione3 f2 = new Frazione3(2, 3);
        
        System.out.println("Frazione 1: " + f1); // 7/3
        System.out.println("Frazione 2: " + f2); // 2/3

        // Test metodo reciproco
        System.out.println("Reciproco di Frazione 1: " + f1.reciproco()); // 3/7

        // Test metodo confronta
        System.out.println("Confronto tra Frazione 1 e Frazione 2: " + f1.confronta(f2)); // 1 (f1 è maggiore di f2)

        // Test metodo toDouble
        System.out.println("Frazione 1 in decimale: " + f1.toDouble()); // 2.3333

        // Test metodo toFrazioneMista
        System.out.println("Frazione mista di Frazione 1: " + f1.toFrazioneMista()); // 2 1/3
    }
}
