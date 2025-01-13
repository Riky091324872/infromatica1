public class ContoBancario {
    private double saldo; // Attributo privato

    // Costruttore
    public ContoBancario(double saldoIniziale) {
        if (saldoIniziale >= 0) {
            saldo = saldoIniziale;
        } else {
            saldo = 0;
            System.out.println("Errore: il saldo iniziale non può essere negativo. Impostato a 0.");
        }
    }

    // Metodo per visualizzare il saldo
    public double getSaldo() {
        return saldo;
    }

    // Metodo per depositare denaro
    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Deposito completato. Saldo attuale: " + saldo);
        } else {
            System.out.println("Errore: l'importo deve essere positivo.");
        }
    }

    // Metodo per prelevare denaro
    public void preleva(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelievo completato. Saldo attuale: " + saldo);
        } else {
            System.out.println("Errore: prelievo non possibile.");
        }
    }

    // Metodo main per simulare operazioni
    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario(1000); // Saldo iniziale 1000

        conto.deposita(500);  // Aggiunge 500
        conto.preleva(300);   // Toglie 300
        conto.preleva(1500);  // Errore: fondi insufficienti

        System.out.println("Saldo finale: " + conto.getSaldo());
    }
}
