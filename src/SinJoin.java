public class SinJoin {
    public static void main(String[] args) throws InterruptedException {
        //Pau Mondragon Torres
        Tarea1antes t1 = new Tarea1antes(0);
        Tarea1antes t2 = new Tarea1antes(1);
        Tarea1antes t3 = new Tarea1antes(2);

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Final del programa");
    }
}

class Tarea1a extends Thread{
    private int idHebra;
    public Tarea1a (int idHebra){
        this.idHebra = idHebra;
    }
    public void run(){
        try{
            int x = (int) (Math.random() * 5000);
            Thread.sleep(x);
            System.out.println("Soy la hebra: "+ idHebra + "( " + x + ")" );
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}