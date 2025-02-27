public class Prenotazione {
    protected String nomeCliente;
    protected String dataPrenotazione;

    public Prenotazione(String nomeCliente, String dataPrenotazione) {
        this.nomeCliente = nomeCliente;
        this.dataPrenotazione = dataPrenotazione;
    }

    public void StampaPrenotazione() {
        System.out.println("Cliente: " + nomeCliente + " data: " + dataPrenotazione);
    }
}

class PrenotazioneHotel extends Prenotazione {
    private int numeroStanza;
    private int numeroNotte;

    public PrenotazioneHotel(String nomeCliente, String dataPrenotazione, int numeroStanza, int numeroNotte) {
        super(nomeCliente, dataPrenotazione);
        this.numeroStanza = numeroStanza;
        this.numeroNotte = numeroNotte;
    }

    @Override
    public void StampaPrenotazione() {
        System.out.println("Cliente: " + nomeCliente + ", data: " + dataPrenotazione + ", stanza: " + numeroStanza + ", notte: " + numeroNotte);
    }
}

class PrenotazioneRistorante extends Prenotazione {
    private int numeroTavolo;
    private int oraPrenotazione;

    public PrenotazioneRistorante(String nomeCliente, String dataPrenotazione, int numeroTavolo, int oraPrenotazione) {
        super(nomeCliente, dataPrenotazione);  
        this.numeroTavolo = numeroTavolo;
        this.oraPrenotazione = oraPrenotazione;
    }

    @Override
    public void StampaPrenotazione() {
        System.out.println("Cliente: " + nomeCliente + ", data: " + dataPrenotazione + ", tavolo: " + numeroTavolo + ", ora: " + oraPrenotazione);
    }
}

public class SistemaProgrammazione {
    public static void main(String[] args) {
        PrenotazioneHotel prenotazioneHotel = new PrenotazioneHotel("Mario Rossi", "2025-03-10", 101, 3);
        PrenotazioneRistorante prenotazioneRistorante = new PrenotazioneRistorante("Lucia Bianchi", "2025-02-20", 5, 20);

        prenotazioneHotel.StampaPrenotazione();
        prenotazioneRistorante.StampaPrenotazione();
    }
}
