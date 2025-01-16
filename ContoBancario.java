public class ContoBancario {

    private int saldo; 

    public ContoBancario(int saldoIniziale) {
        saldo = saldoIniziale >= 0 ? saldoIniziale : 0; 
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int nuovoSaldo) {
        saldo = nuovoSaldo >= 0 ? nuovoSaldo : saldo; 
    }

    public void deposita(int importo) {
        if (importo > 0) {
            saldo += importo;
        }
    }

    // Metodo per prelevare un importo
    public void preleva(int importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
        }
    }

    public static void main(String[] args) {
        // Creazione del conto bancario con saldo iniziale di 0 centesimi
        ContoBancario conto = new ContoBancario(0);

        System.out.println("Saldo iniziale: " + (conto.getSaldo() / 100.0) + "€");

        conto.deposita(5000);  // Deposita 50€ (5000 centesimi)
        conto.deposita(10000); // Deposita 100€ (10000 centesimi)
        conto.preleva(3000);   // Preleva 30€ (3000 centesimi)


        System.out.println("Saldo finale: " + (conto.getSaldo() / 100.0) + "€");
    }
}
