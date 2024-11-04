import java.util.Scanner;

public class OperazioniStringa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Leggi due stringhe e verifica se sono uguali ignorando maiuscole/minuscole
        System.out.println("Inserisci la prima stringa:");
        String stringa1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa:");
        String stringa2 = scanner.nextLine();
        if (stringa1.equalsIgnoreCase(stringa2)) {
            System.out.println("Le stringhe sono uguali (ignorando maiuscole/minuscole).");
        } else {
            System.out.println("Le stringhe sono diverse.");
        }

        // 2. Leggi una stringa e prova a convertirla in numero intero
        System.out.println("\nInserisci una stringa da convertire in numero intero:");
        String stringaIntero = scanner.nextLine();
        try {
            int numeroIntero = Integer.parseInt(stringaIntero);
            System.out.println("Numero intero: " + numeroIntero);
        } catch (NumberFormatException e) {
            System.out.println("Errore: La stringa non è un numero intero valido.");
        }

        // 3. Leggi una stringa e prova a convertirla in numero decimale
        System.out.println("\nInserisci una stringa da convertire in numero decimale:");
        String stringaDecimale = scanner.nextLine();
        try {
            double numeroDecimale = Double.parseDouble(stringaDecimale);
            System.out.println("Numero decimale: " + numeroDecimale);
        } catch (NumberFormatException e) {
            System.out.println("Errore: La stringa non è un numero decimale valido.");
        }

        // 4. Leggi una frase e separa ogni parola su una riga diversa
        System.out.println("\nInserisci una frase da dividere in parole:");
        String frase = scanner.nextLine();
        String[] parole = frase.split(" ");
        System.out.println("Le parole nella frase sono:");
        for (String parola : parole) {
            System.out.println(parola);
        }

        // 5. Leggi una stringa e stampa i primi 5 caratteri
        System.out.println("\nInserisci una stringa per stampare i primi 5 caratteri:");
        String stringaInput = scanner.nextLine();
        if (stringaInput.length() >= 5) {
            System.out.println("I primi 5 caratteri sono: " + stringaInput.substring(0, 5));
        } else {
            System.out.println("La stringa ha meno di 5 caratteri: " + stringaInput);
        }

        // 6. Leggi una stringa e stampa gli ultimi 5 caratteri
        System.out.println("\nInserisci una stringa per stampare gli ultimi 5 caratteri:");
        stringaInput = scanner.nextLine();
        if (stringaInput.length() >= 5) {
            System.out.println("Gli ultimi 5 caratteri sono: " + stringaInput.substring(stringaInput.length() - 5));
        } else {
            System.out.println("La stringa ha meno di 5 caratteri: " + stringaInput);
        }

        // 7. Leggi una frase e trova la parola più lunga
        System.out.println("\nInserisci una frase per trovare la parola più lunga:");
        frase = scanner.nextLine();
        parole = frase.split(" ");
        String parolaPiuLunga = "";
        for (String parola : parole) {
            if (parola.length() > parolaPiuLunga.length()) {
                parolaPiuLunga = parola;
            }
        }
        System.out.println("La parola più lunga è: " + parolaPiuLunga);

        scanner.close();
    }
}
