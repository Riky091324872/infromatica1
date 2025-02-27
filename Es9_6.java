interface Animale {
    void verso();
    void muoviti();
}

interface Parlante {
    void parla();
    void saluta();
}

class Pappagallo implements Animale, Parlante {
    public void verso() { System.out.println("Il pappagallo fischia"); }
    public void muoviti() { System.out.println("Il pappagallo vola"); }
    public void parla() { System.out.println("Il pappagallo dice: Ciao!"); }
    public void saluta() { System.out.println("Il pappagallo saluta con un battito d'ali"); }
}

class Cane implements Animale {
    public void verso() { System.out.println("Il cane abbaia"); }
    public void muoviti() { System.out.println("Il cane corre"); }
}

class Gatto implements Animale {
    public void verso() { System.out.println("Il gatto miagola"); }
    public void muoviti() { System.out.println("Il gatto cammina silenziosamente"); }
}

public class Es9_6 {
    public static void main(String[] args) {
        Pappagallo pappagallo = new Pappagallo();
        Cane cane = new Cane();
        Gatto gatto = new Gatto();

        pappagallo.verso();
        pappagallo.muoviti();
        pappagallo.parla();
        pappagallo.saluta();
        
        System.out.println();
        
        cane.verso();
        cane.muoviti();
        
        System.out.println();
        
        gatto.verso();
        gatto.muoviti();
    }
}
