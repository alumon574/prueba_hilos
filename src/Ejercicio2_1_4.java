
public class Ejercicio2_1_4 {
    public static void main(String[] args) {
        //Pau Mondragon Torres
        Tarea1antes t1 = new Tarea1antes(0);
        Tarea1antes t2=new Tarea1antes(1);

        t1.start();
        t2.start();

    }
}
class Tarea1antes extends Thread{
    int idHebra;
    public Tarea1antes(int idHebra){
        this.idHebra=idHebra;
    }
    public void run(){
        System.out.println("Soy la hebra " + idHebra);
    }
}
