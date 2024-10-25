import java.util.Scanner;

public class equazione {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("inserisci la prima incognita: ");
        int a = input.nextInt();
        System.out.println("inserisci la seconda incognita: ");
        int b = input.nextInt();
        System.out.println("inserisci il termine noto: ");
        int c = input.nextInt();
        input.close();

        int delta = b*b -4*a*c;
        int x1,x2;
        //se delta <0 impossibile
        if (delta<0) {
            System.out.println("Impossibile");
            return;
        } else { //delta >=0
            x1 = ( -b -(delta)^(1/2) ) / 2*a;
            x2 = ( -b +(delta)^(1/2) ) / 2*a;
        }

        System.out.printf("x1 è: %d ", x1);
        System.out.printf("x2 è: %d ", x2);

    }
}
    