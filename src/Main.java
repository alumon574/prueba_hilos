public class Main {
    public static void main(String[] args) {
        int numHilos = 4;
        int numProcesos = 24;
        int mId =1;

        int Tam = (numProcesos+numHilos-1)/numHilos;
        int ini=mId*Tam;
        int fin = Math.min(numProcesos,(mId+1)*Tam);
        for (int i=ini;i<fin;i++){
            System.out.println(i);

        }
    }
}