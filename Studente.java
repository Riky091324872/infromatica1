import java.util.Scanner;

public class Studente {
    private String nome;
    private String cognome;
    private float mediaVoti;

    public Studente() {
        nome = "Sconosciuto";
        cognome = "Sconosciuto";
        mediaVoti = 0.0f;
    }

    public void setNome(String nomeInput) {
        if (nomeInput != null && !nomeInput.isEmpty()) {
            nome = nomeInput;
        } else {
            nome = "Sconosciuto";
        }
    }

    public void setCognome(String cognomeInput) {
        if (cognomeInput != null && !cognomeInput.isEmpty()) {
            cognome = cognomeInput;
        } else {
            cognome = "Sconosciuto";
        }
    }

    public void setMediaVoti(float mediaVotiInput) {
        if (mediaVotiInput >= 0 && mediaVotiInput <= 10) {
            mediaVoti = mediaVotiInput;
        } else {
            mediaVoti = 0.0f;
        }
    }

    public void stampaDettagli() {
        System.out.println("Studente: " + nome + " " + cognome + ", Media Voti: " + mediaVoti);
    }

    public static void main(String[] args) {
        Studente studente = new Studente();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome dello studente: ");
        String nomeUtente = scanner.nextLine();
        studente.setNome(nomeUtente);

        System.out.print("Inserisci il cognome dello studente: ");
        String cognomeUtente = scanner.nextLine();
        studente.setCognome(cognomeUtente);

        System.out.print("Inserisci la media dei voti (tra 0 e 10): ");
        float mediaVotiUtente = scanner.nextFloat();
        studente.setMediaVoti(mediaVotiUtente);

        studente.stampaDettagli();
        scanner.close();
    }
}
