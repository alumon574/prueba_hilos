public class Practica5Reducciones {
    public static void main(String[] args) throws InterruptedException {
        int numHebras = 4;
        long[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41};

        secuencial(vector);
        ciclico(vector, numHebras);
    }

    static void secuencial(long[] vector) {
        long t1;
        long t2;
        double tt;


        t1 = System.nanoTime();

        int mult2 = 0;
        int mult3 = 0;
        int mult5 = 0;
        for (int i = 0; i < vector.length; i++) {
            if (multiplo2(vector[i]))
                mult2++;
            if (multiplo3(vector[i]))
                mult3++;
            if (multiplo5(vector[i]))
                mult5++;
        }
        System.out.println("multiplos de 2 = " + mult2);
        System.out.println("multiplos de 3 = " + mult3);
        System.out.println("multiplos de 5 = " + mult5);
        t2 = System.nanoTime();
        tt = ((double) (t2 - t1)) / 1.0e9;

        System.out.println("Tiempo secuencial (seg.):\t\t\t" + tt);
    }

    static void ciclico(long[] vector, int numHebras) throws InterruptedException {
        long t1;
        long t2;
        double tt;
        t1 = System.nanoTime();
        hiloCiclico v[] = new hiloCiclico[numHebras];
        for (int i = 0; i < numHebras; i++) {
            v[i] = new hiloCiclico(i, numHebras, vector);
            v[i].start();
            v[i].join();
        }
        t2 = System.nanoTime();
        tt = ((double) (t2 - t1)) / 1.0e9;

        System.out.println("Tiempo cíclico (seg.):\t\t\t" + tt);

    }

    public static boolean multiplo2(long vector) {
        return vector % 2 == 0;
    }

    public static boolean multiplo3(long vector) {
        return vector % 3 == 0;
    }

    public static boolean multiplo5(long vector) {
        return vector % 5 == 0;
    }
}

class hiloCiclico extends Thread {

    int mult2 = 0;
    int mult3 = 0;
    int mult5 = 0;
    private int idHebra;
    private int numHebras;
    private long vectorNumeros[];

    public hiloCiclico(int idHebra, int numHebras, long[] vectorNumeros) {
        this.idHebra = idHebra;
        this.numHebras = numHebras;
        this.vectorNumeros = vectorNumeros;
    }

    public void run() {
        for (int i = idHebra; i < vectorNumeros.length - 1; i += numHebras) {
            if (Practica5Reducciones.multiplo2(vectorNumeros[i]))
                mult2++;
            if (Practica5Reducciones.multiplo3(vectorNumeros[i]))
                mult3++;
            if (Practica5Reducciones.multiplo5(vectorNumeros[i]))
                mult5++;
        }
        System.out.println("Multiplos de 2 = " + mult2);
        System.out.println("Mutliplos de 3 = " + mult3);
        System.out.println("Mutliplos de 5 = " + mult5);
    }
}

