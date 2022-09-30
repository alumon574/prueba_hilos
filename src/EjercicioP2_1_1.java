public class EjercicioP2_1_1 {
    public static void main(String[] args) {
        int numHebras = 2;
        numHebra [] v = new numHebra[20];

        for (int i = 0; i < numHebras; i++) {
            v[i] = new numHebra(i);
            v[i].start();
            try {
                v[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
}

class numHebra extends Thread {
    int idHebra;

    public numHebra(int idHebra) {
        this.idHebra = idHebra;
    }

    public void run() {
        System.out.println("Soy la hebra: " + idHebra);
    }
}