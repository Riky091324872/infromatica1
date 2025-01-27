class Dipendente {
    private String nome;
    private double stipendioBase;

    Dipendente(String nome, double stipendioBase) {
        this.nome = nome;
        this.stipendioBase = stipendioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    void stampaStipendio() {
        System.out.println("Nome: " + nome + ", Stipendio Base: " + stipendioBase);
    }
}

class Manager extends Dipendente {
    private double bonus;

    Manager(String nome, double stipendioBase, double bonus) {
        super(nome, stipendioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    void stampaStipendio() {
        double stipendioTotale = getStipendioBase() + bonus;
        System.out.println("Nome: " + getNome() + ", Stipendio Totale: " + stipendioTotale);
    }
}

class Main {
    private static void main(String[] args) {
        Dipendente dipendente = new Dipendente("Mario", 2000.0);
        dipendente.stampaStipendio();

        Manager manager = new Manager("Laura", 2000.0, 1000.0);
        manager.stampaStipendio();
    }
}
