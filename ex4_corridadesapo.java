public class CorridaDeSapos {
    public static void main(String[] args) {
        int saltoMaximo = 5;
        int distanciaMaxima = 20;

        Thread sapo1 = new Thread(new Sapo("Sapo 1", saltoMaximo, distanciaMaxima));
        Thread sapo2 = new Thread(new Sapo("Sapo 2", saltoMaximo, distanciaMaxima));
        Thread sapo3 = new Thread(new Sapo("Sapo 3", saltoMaximo, distanciaMaxima));
        Thread sapo4 = new Thread(new Sapo("Sapo 4", saltoMaximo, distanciaMaxima));
        Thread sapo5 = new Thread(new Sapo("Sapo 5", saltoMaximo, distanciaMaxima));

        sapo1.start();
        sapo2.start();
        sapo3.start();
        sapo4.start();
        sapo5.start();
    }
}
s