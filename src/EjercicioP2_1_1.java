public class EjercicioP2_1_1 {
    public static void main(String[] args) throws InterruptedException {
        int numHebras = 2;
        Thread[] arrayThreads = new Thread[1000];
        for (int i = 0; i < numHebras; i++) {
            arrayThreads[i] = new Thread(new numHebra(i));
            arrayThreads[i].start();
        }
        for (int i = 0; i < numHebras; i++) {
            arrayThreads[i].join();
        }
        System.out.println("Todas las hebras han terminado");
    }
}

class numHebra extends Thread {
    int idHebra;

    public numHebra(int idHebra) {
        this.idHebra = idHebra;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {

            System.out.println("Soy la hebra: " + idHebra);
        }
    }
}






