import java.util.Random;
class ThreadVetor extends Thread {
    private int numero;
    private int[] vetor;

    public ThreadVetor(int numero, int[] vetor) {
        this.numero = numero;
        this.vetor = vetor;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        if (numero % 2 == 0) {
            for (int i = 0; i < vetor.length; i++) {
                // Simula processamento
                int valor = vetor[i];
            }
        } else {
            for (int valor : vetor) {
                // Simula processamento
            }
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Thread " + numero + " - Tempo: " + duration + " ms");
    }
}

