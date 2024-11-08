public class Calcolatrice {

    public int sottrai(int a, int b) {
        return a - b;
    }

    public int moltiplica(int a, int b) {
        return a * b;
    }

    public double dividi(int a, int b) {
        if (b == 0) {
            System.out.println("Non puoi dividere per zero!");
            return 0; 
        }
        return (double) a / b; 
    }

    public static void main(String[] args) {
        Calcolatrice calc = new Calcolatrice(); 

        System.out.println(calc.sottrai(10, 5));       
        System.out.println(calc.moltiplica(10, 5));    
        System.out.println(calc.dividi(10, 2));        
        System.out.println(calc.dividi(10, 0));        
    }
}
