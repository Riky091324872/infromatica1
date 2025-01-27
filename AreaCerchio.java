import java.util.Scanner;

class AreaCerchio {
    private double raggio;

    AreaCerchio(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public double calcolaArea() {
        return Math.PI * Math.pow(raggio, 2);
    }
}

class VolumeCilindro extends AreaCerchio {
    private double altezza;

    VolumeCilindro(double raggio, double altezza) {
        super(raggio);
        this.altezza = altezza;
    }

    public double calcolaVolume() {
        return calcolaArea() * altezza;
    }
}

class VolumeSfera extends AreaCerchio {

    VolumeSfera(double raggio) {
        super(raggio);
    }

    public double calcolaVolume() {
        return (4 / 3.0) * Math.PI * Math.pow(getRaggio(), 3);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il raggio del cerchio: ");
        double raggio = scanner.nextDouble();

        AreaCerchio cerchio = new AreaCerchio(raggio);
        double area = cerchio.calcolaArea();
        System.out.println("Area del cerchio: " + area);

        System.out.print("Inserisci l'altezza del cilindro: ");
        double altezza = scanner.nextDouble();

        VolumeCilindro cilindro = new VolumeCilindro(raggio, altezza);
        double volumeCilindro = cilindro.calcolaVolume();
        System.out.println("Volume del cilindro: " + volumeCilindro);

        VolumeSfera sfera = new VolumeSfera(raggio);
        double volumeSfera = sfera.calcolaVolume();
        System.out.println("Volume della sfera: " + volumeSfera);
    }
}
