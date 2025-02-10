public class Es8_6 {
    public static void main(String[] args) {
        DatabaseConnection conn = new DatabaseConnection();

        try {
            conn.open();
            conn.executeQuery();
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            conn.close();
        }
    }
}

class DatabaseConnection {
    public void open() {
        System.out.println("Connessione al database aperta.");
    }

    public void executeQuery() throws Exception {
        System.out.println("Esecuzione della query...");
        throw new Exception("Errore durante l'esecuzione della query.");
    }

    public void close() {
        System.out.println("Connessione al database chiusa.");
    }
}
