  public class Frazione{


    private int numeratore;
    private int denominatore;

    public Frazione (int num, int den) {

        numeratore = num;
        denominatore = den;
    }
    public Frazione () {
     
        numeratore = 0;
        denominatore = 1;
    }
    public int getNumeratore() {
    return numeratore;


    }


    public int getDenominatore() {
        return denominatore;
    }


    public void setNumeratore(int numeratore){
        this.numeratore = numeratore;
    }


    public void setDenominatore(int denominatore){
        this.denominatore = denominatore;
    }
        public Frazione somma(Frazione f) {
            int num = numeratore * f.denominatore + f.numeratore * denominatore;
            int den = denominatore * f.denominatore;
            return new Frazione(num, den).semplifica();
        }
   
        public Frazione sottrai(Frazione f) {
            int num = numeratore * f.denominatore - f.numeratore * denominatore;
            int den = denominatore * f.denominatore;
            return new Frazione(num, den).semplifica();
        }
   
        public Frazione moltiplica(Frazione f) {
            int num = numeratore * f.numeratore;
            int den = denominatore * f.denominatore;
            return new Frazione(num, den).semplifica();
        }
   
        public Frazione dividi(Frazione f) {
            int num = numeratore * f.denominatore;
            int den = denominatore * f.numeratore;
            return new Frazione(num, den).semplifica();
        }

        public Frazione semplifica(){
        int mcd = calcolaMCD(numeratore, denominatore);
        numeratore /= mcd;
        denominatore /= mcd;
        return this;
         
      }

      private int calcolaMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
       }
        public String toString() {


            return numeratore + "/" + denominatore;
        }
                public static void main(String[] args) {
           
            Frazione f1 = new Frazione(1,2);
            Frazione f2 = new Frazione(1,2);
            Frazione f3 = new Frazione ();
 
         System.out.println("f1 = "+ f1);
         System.out.println("f2 = "+ f2);
         System.out.println("f3 (costruttore senza parametri) = "+ f3);


         System.out.println("f1 + f2 = " + f1.somma(f2));
         System.out.println("f1 - f2 = " + f1.sottrai(f2));
         System.out.println("f1 * f2 = " + f1.moltiplica(f2));
         System.out.println("f1 / f2 = " + f1.dividi(f2));


         }


    }
