public class Ejercicio2_1_5 {
    public static void main(String[] args) {


        //Pau Mondragon Torres
        Thread t1 = new Thread(new Tarea1());
        Thread t2 = new Thread(new Tarea2());

        t1.start();
        t2.start();

    }
}

class Tarea1 extends Thread{
    public void run() {
        for (int i=0;i<3;i++)
            System.out.println("Hola");
    }
}

class Tarea2 extends Thread{
    public void run() {
        for (int i=0;i<3;i++)
            System.out.println("Adios");
    }
}