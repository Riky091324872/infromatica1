class Saluto extends Thread {
    private String nome;

    public Saluto(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        System.out.println("Thread che saluta. Creato come estensione della classe Thread");
    }
}

class MioSaluto implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread eseguito tramite runnable");
    }
}

public class esTH {
    public static void main(String[] args) {
        Saluto salutoThread = new Saluto("SalutoThread");
        salutoThread.start();

        MioSaluto mioSalutoRunnable = new MioSaluto();
        Thread mioSalutoThread = new Thread(mioSalutoRunnable);
        mioSalutoThread.start();

        Thread lambdaThread = new Thread(() -> {
            System.out.println("Sto usando una lamda expression");
        });
        lambdaThread.start();
    }
}
