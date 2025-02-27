abstract class es9_1 {
    abstract void emettiVerso();
    
    public static void main(String[] args) {
        es9_1 cane = new Cane();
        es9_1 gatto = new Gatto();
        es9_1 altroCane = new Cane();
        
        cane.emettiVerso();
        gatto.emettiVerso();
        altroCane.emettiVerso();
    }
}

class Cane extends es9_1 {
    @Override
    void emettiVerso() {
        System.out.println("Bau");
    }
}

class Gatto extends es9_1 {
    @Override
    void emettiVerso() {
        System.out.println("Miao");
    }
}
