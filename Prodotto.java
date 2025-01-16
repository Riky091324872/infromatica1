import java.util.Scanner;

public class Prodotto {
    private String nome;
    private double prezzo;
    private int quantità;

    public void setNome(String nomeInput) {
        nome = nomeInput;
    }

    public void setPrezzo(double prezzoInput) {
        if (prezzoInput > 0) {
            prezzo = prezzoInput;
        } else {
            prezzo = 0;
            System.out.println("Errore: il prezzo deve essere maggiore di zero. Impostato a 0.");
        }
    }

    public void setQuantità(int quantitàInput) {
        if (quantitàInput >= 0) {
            quantità = quantitàInput;
        } else {
            quantità = 0;
            System.out.println("Errore: la quantità deve essere maggiore o uguale a zero. Impostata a 0.");
        }
    }

    public double calcolaValoreTotale() {
        return prezzo * quantità;
    }

    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome del prodotto: ");
        String nomeProdotto = scanner.nextLine();
        prodotto.setNome(nomeProdotto);

        System.out.print("Inserisci il prezzo del prodotto: ");
        double prezzoProdotto = scanner.nextDouble();
        prodotto.setPrezzo(prezzoProdotto);

        System.out.print("Inserisci la quantità del prodotto: ");
        int quantitàProdotto = scanner.nextInt();
        prodotto.setQuantità(quantitàProdotto);

        double valoreTotale = prodotto.calcolaValoreTotale();

        System.out.println("Nome: " + nomeProdotto);
        System.out.println("Prezzo: " + prezzoProdotto);
        System.out.println("Quantità: " + quantitàProdotto);
        System.out.println("Valore totale: " + valoreTotale);

        scanner.close();
    }
}
