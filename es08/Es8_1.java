import java.util.Scanner;

public class Es8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Inserisci il primo numero: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Inserisci il secondo numero: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Inserisci l'operazione (+, -, *, /): ");
            char operazione = scanner.nextLine().charAt(0);
            
            int risultato;
            
            switch (operazione) {
                case '+':
                    risultato = num1 + num2;
                    break;
                case '-':
                    risultato = num1 - num2;
                    break;
                case '*':
                    risultato = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Errore: Divisione per zero non consentita.");
                    }
                    risultato = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Errore: Operazione non valida.");
            }
            
            System.out.println("Risultato: " + risultato);
        } catch (NumberFormatException e) {
            System.out.println("Errore: Inserisci solo numeri validi.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
