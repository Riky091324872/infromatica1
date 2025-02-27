abstract class Es9_2 {
    abstract int calcolaArea();

    public static void main(String[] args) {
        Es9_2 cerchio = new Cerchio(5);
        Es9_2 rettangolo = new Rettangolo(4, 5);

        System.out.println("Area: " + cerchio.calcolaArea());
        System.out.println("Area: " + rettangolo.calcolaArea());
    }
}

class Cerchio extends Es9_2 {
    private int raggio;

    public Cerchio(int raggio) {
        this.raggio = raggio;
    }

    @Override
    int calcolaArea() {
        return 3 * raggio * raggio;
    }
}

class Rettangolo extends Es9_2 {
    private int base, altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    int calcolaArea() {
        return base * altezza;
    }
}
