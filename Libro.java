import java.util.Scanner;

public class Libro {
    private String titolo;
    private String autore;
    private String disponibile;

    public void setTitolo(String nuovoTitolo) {
        titolo = nuovoTitolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setAutore(String nuovoAutore) {
        autore = nuovoAutore;
    }

    public String getAutore() {
        return autore;
    }

    public void setDisponibile(String nuovaDisponibilita) {
        if (nuovaDisponibilita.equalsIgnoreCase("Sì") || nuovaDisponibilita.equalsIgnoreCase("No")) {
            disponibile = nuovaDisponibilita;
        } else {
            disponibile = "No";
            System.out.println("Errore: la disponibilità deve essere 'Sì' o 'No'. Impostato a 'No'.");
        }
    }

    public String getDisponibile() {
        return disponibile;
    }
}

class Biblioteca {
    private Libro[] libri;
    private int indice;

    public Biblioteca(int capacita) {
        libri = new Libro[capacita];
        indice = 0;
    }

    public void aggiungiLibro(Libro libro) {
        if (indice < libri.length) {
            libri[indice] = libro;
            indice++;
        } else {
            System.out.println("La biblioteca è piena!");
        }
    }

    public void stampaCatalogo() {
        for (int i = 0; i < indice; i++) {
            Libro libro = libri[i];
            System.out.println("Titolo: " + libro.getTitolo() + ", Autore: " + libro.getAutore() + ", Disponibile: " + libro.getDisponibile());
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(5);

        for (int i = 0; i < 2; i++) {  // Aggiungiamo 2 libri (puoi cambiare la quantità)
            Libro libro = new Libro();

            System.out.print("Inserisci il titolo del libro: ");
            libro.setTitolo(scanner.nextLine());

            System.out.print("Inserisci l'autore del libro: ");
            libro.setAutore(scanner.nextLine());

            System.out.print("Il libro è disponibile (Sì/No): ");
            String disponibile = scanner.nextLine();
            libro.setDisponibile(disponibile);

            biblioteca.aggiungiLibro(libro);
        }

        System.out.println("\nCatalogo della Biblioteca:");
        biblioteca.stampaCatalogo();

        scanner.close();
    }
}
