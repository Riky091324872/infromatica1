public class Main {

    private static class Rettangolo {
        private int larghezza;
        private int altezza;

        public Rettangolo(int larghezzaIniziale, int altezzaIniziale) {
            setLarghezza(larghezzaIniziale);
            setAltezza(altezzaIniziale);
        }

        public int getLarghezza() {
            return larghezza;
        }

        public void setLarghezza(int nuovaLarghezza) {
            if (nuovaLarghezza > 0) {
                larghezza = nuovaLarghezza;
            }
        }

        public int getAltezza() {
            return altezza;
        }

        public void setAltezza(int nuovaAltezza) {
            if (nuovaAltezza > 0) {
                altezza = nuovaAltezza;
            }
        }

        public int calcolaArea() {
            return larghezza * altezza;
        }
    }

    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 3);

        rettangolo.setLarghezza(10);
        rettangolo.setAltezza(7);

        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());
    }
}
