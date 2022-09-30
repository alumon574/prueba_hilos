package bloque2_1;

public class EjemploSecuencial {
    public static void main(String[] args) {
        //Pau Mondragon Torres
        Tarea1 t1 = new Tarea1();
        Tarea2 t2 = new Tarea2();

        t1.metodo1();
        t2.metodo2();
    }
    static class Tarea1{
        public void metodo1(){
            for (int i=0;i<10;i++){
                System.out.println("Tarea 1");
            }
        }
    }
    static class Tarea2{
        public void metodo2(){
            for (int i =0;i<10;i++)
                System.out.println("Tarea 2");
        }
    }
}
