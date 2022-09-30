public class Ejercicio2_1_6 {
    public static void main(String[] args) {
        Tarea1_6 t1 = new Tarea1_6(0);
        Tarea1_6 t2 = new Tarea1_6(1);
        Tarea1_6 t3 = new Tarea1_6(2);
        t1.start();
        t2.start();
        t3.start();
    }
}

class Tarea1_6 extends Thread{
    int idHebra;
    public Tarea1_6(int idHebra){
        this.idHebra=idHebra;
    }
    public void run() {
        for (int i=0;i<3;i++){
            if (idHebra%2==0)
                System.out.println("Hola");
            else
                System.out.println("Adios");
        }
    }
}
