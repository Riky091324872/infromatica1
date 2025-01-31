class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public float calcolaArea() {
        return 0f;
    }

    public float calcolaPerimetro() {
        return 0f;
    }

    public void descrizione() {
        System.out.println("Questa è una forma geometrica di tipo: " + nome);
    }
}

class Cerchio extends Forma {
    private float raggio;

    public Cerchio(float raggio) {
        super("Cerchio");
        this.raggio = raggio;
    }

    @Override
    public float calcolaArea() {
        return (float) (Math.PI * raggio * raggio);
    }

    @Override
    public float calcolaPerimetro() {
        return (float) (2 * Math.PI * raggio);
    }
}

class Rettangolo extends Forma {
    private float base;
    private float altezza;

    public Rettangolo(float base, float altezza) {
        super("Rettangolo");
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public float calcolaArea() {
        return base * altezza;
    }

    @Override
    public float calcolaPerimetro() {
        return 2 * (base + altezza);
    }
}

class Triangolo extends Forma {
    private float base;
    private float altezza;
    private float lato1;
    private float lato2;
    private float lato3;

    public Triangolo(float base, float altezza, float lato1, float lato2, float lato3) {
        super("Triangolo");
        this.base = base;
        this.altezza = altezza;
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    @Override
    public float calcolaArea() {
        return (base * altezza) / 2;
    }

    @Override
    public float calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }
}

public class Formageometrica {
    public static void main(String[] args) {
        Forma[] forme = {
            new Cerchio(5),
            new Rettangolo(6, 4),
            new Triangolo(4, 3, 3, 4, 5)
        };

        float areaTotale = 0;
        float perimetroTotale = 0;

        for (Forma forma : forme) {
            forma.descrizione();
            System.out.println("Area: " + forma.calcolaArea());
            System.out.println("Perimetro: " + forma.calcolaPerimetro());
            System.out.println();

            areaTotale += forma.calcolaArea();
            perimetroTotale += forma.calcolaPerimetro();
        }

        System.out.println("Area Totale: " + areaTotale);
        System.out.println("Perimetro Totale: " + perimetroTotale);
    }
}
