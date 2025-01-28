import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {

        String[] nomi = {"Alice", "Bob", "Carol", "David", "Eve"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un nome da cercare: ");
        String nomeInserito = scanner.nextLine();

        boolean trovato = false;

        for (String nome : nomi) {
            if (nome.equalsIgnoreCase(nomeInserito)) { 
                trovato = true;
                break;
            }
        }

        if (trovato) {
            System.out.println("Il nome \"" + nomeInserito + "\" è stato trovato nell'array.");
        } else {
            System.out.println("Il nome \"" + nomeInserito + "\" non è presente nell'array.");
        }
        scanner.close();
    }
}
