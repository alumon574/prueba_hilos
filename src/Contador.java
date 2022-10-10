public class Contador {
    long contador;

  synchronized void incrementaContador() {
        contador+=100000;
    }

   synchronized long verContador() {
        return contador;
    }
}
