public class P2_1_2 {
    public static void main(String[] args) throws InterruptedException {
        //Pau Mondragon Torres
        Contador contador = new Contador();
        int numHebras = 4;
        numHebraContador[] v = new numHebraContador[100];
        for (int i = 0; i < numHebras; i++) {
            v[i] = new numHebraContador(i,contador);
            v[i].start();
        }
        for (int i = 0; i < numHebras; i++) {
            v[i].join();
        }
    }

    static class numHebraContador extends Thread {
        int idHebra;
        Contador contador;
        public numHebraContador(int idHebra,Contador contador) {
            this.idHebra = idHebra;
            this.contador=contador;
        }

        public void run() {
            System.out.println("Hebra:" + idHebra);
            System.out.println("Contador antes de incrementar: " + contador.verContador());
            contador.incrementaContador();
            System.out.println("Contador despues de incrementar: " + contador.verContador());

        }
    }
}
