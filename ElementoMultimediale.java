import java.util.ArrayList;
import java.util.List;

class ElementoMultimediale {
    private String titolo;
    private String autore;

    ElementoMultimediale(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void riproduci() {
        System.out.println("Riproduzione non disponibile");
    }
}

class Video extends ElementoMultimediale {
    private int durata;

    Video(String titolo, String autore, int durata) {
        super(titolo, autore);
        this.durata = durata;
    }

    @Override
    public void riproduci() {
        System.out.println("Riproduzione video: " + getTitolo());
    }
}

class Audio extends ElementoMultimediale {
    private String qualitàAudio;

    Audio(String titolo, String autore, String qualitàAudio) {
        super(titolo, autore);
        this.qualitàAudio = qualitàAudio;
    }

    @Override
    public void riproduci() {
        System.out.println("Riproduzione audio: " + getTitolo() + " in " + qualitàAudio);
    }
}

public class Main {
    public static void main(String[] args) {
        List<ElementoMultimediale> listaMultimediale = new ArrayList<>();

        listaMultimediale.add(new Video("Avatar", "James Cameron", 162));
        listaMultimediale.add(new Audio("Imagine", "John Lennon", "Alta Qualità"));

        for (ElementoMultimediale elemento : listaMultimediale) {
            elemento.riproduci();
        }
    }
}
