class rettangolo {
    
    public int larghezza;
    public int altezza;


    public rettangolo(int larghezza, int altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    public static void main(String[] args) {
    
        rettangolo rettangolo = new rettangolo(5, 10);
        
        
        System.out.println("Larghezza iniziale: " + rettangolo.larghezza);
        System.out.println("Altezza iniziale: " + rettangolo.altezza);
        
        
        rettangolo.larghezza = 7;
        rettangolo.altezza = 12;

        
        System.out.println("Nuova larghezza: " + rettangolo.larghezza);
        System.out.println("Nuova altezza: " + rettangolo.altezza);

        
        int area = rettangolo.larghezza * rettangolo.altezza;
        int perimetro = 2 * (rettangolo.larghezza + rettangolo.altezza);
        
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
