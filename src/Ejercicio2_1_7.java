public class Ejercicio2_1_7 {
    public static void main(String[] args) {
        int numHebras = 20;
        numHebra1_7[] v = new numHebra1_7[20];

        for (int i = 0; i < numHebras; i++) {
            v[i] = new numHebra1_7(i);
            v[i].start();
            try {
                v[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Fin de las hebras");
    }
}

class numHebra1_7 extends Thread{
    int idHebra;
    public numHebra1_7(int idHebra){
        this.idHebra=idHebra;
    }

    public void run() {
        System.out.println("Soy la hebra: "+ idHebra);
    }
}
