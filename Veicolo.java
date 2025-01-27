class Veicolo {
    private String marca;
    private String modello;

    Veicolo(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    void stampaDettagli() {
        System.out.println("Marca: " + marca + ", Modello: " + modello);
    }
}

class Auto extends Veicolo {
    private int numeroPorte;

    Auto(String marca, String modello, int numeroPorte) {
        super(marca, modello);
        this.numeroPorte = numeroPorte;
    }

    @Override
    void stampaDettagli() {
        System.out.println("Marca: " + getMarca() + ", Modello: " + getModello() + ", Numero di Porte: " + numeroPorte);
    }
}

class Moto extends Veicolo {
    private boolean haSidecar;

    Moto(String marca, String modello, boolean haSidecar) {
        super(marca, modello);
        this.haSidecar = haSidecar;
    }

    @Override
    void stampaDettagli() {
        System.out.println("Marca: " + getMarca() + ", Modello: " + getModello() + ", Sidecar: " + (haSidecar ? "Sì" : "No"));
    }
}

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Fiat", "Panda", 5);
        auto.stampaDettagli();

        Moto moto = new Moto("Harley-Davidson", "Softail", false);
        moto.stampaDettagli();
    }
}
