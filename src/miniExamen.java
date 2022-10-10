public class miniExamen {
    public static void main(String[] args) throws InterruptedException {
        //Pau Mondragon Torres
        int numHebras = 4;
        int contador = 0;
        numHebraExamen[] v = new numHebraExamen[100];
        for (int i = 0; i < numHebras; i++) {
            v[i] = new numHebraExamen(i);
            v[i].start();
        }
        System.out.println(contador);
    }
}


class numHebraExamen extends Thread {
    int idHebra;
    Contador contador = new Contador();

    public numHebraExamen(int idHebra) {
        this.idHebra = idHebra;
    }

    public void run() {
        contador.incrementaContador();
        System.out.println("Soy la hebra: " + idHebra);
        contador.verContador();
    }
}

