import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

class Sapo implements Runnable {
    private static final AtomicInteger colocacao = new AtomicInteger(1);
    private String nome;
    private int distanciaMaxima;
    private int distanciaPercorrida;
    private int saltoMaximo;

    public Sapo(String nome, int saltoMaximo, int distanciaMaxima) {
        this.nome = nome;
        this.saltoMaximo = saltoMaximo;
        this.distanciaMaxima = distanciaMaxima;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (distanciaPercorrida < distanciaMaxima) {
            int salto = random.nextInt(saltoMaximo + 1);
            distanciaPercorrida += salto;
            System.out.println(nome + " deu um salto de " + salto + " metros e percorreu " + distanciaPercorrida + " metros no total.");
            if (distanciaPercorrida >= distanciaMaxima) {
                System.out.println(nome + " chegou ao final da corrida! Colocação: " + colocacao.getAndIncrement());
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

