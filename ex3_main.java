import java.util.Random;
public class main {
    public static void main(String[] args) {
        int[] vetor = new int[1000];
        Random random = new Random();

        // Preenche o vetor com valores aleatórios de 1 a 100
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100) + 1;
        }

        // Cria e inicia as threads
        ThreadVetor thread1 = new ThreadVetor(1, vetor);
        ThreadVetor thread2 = new ThreadVetor(2, vetor);

        thread1.start();
        thread2.start();
    }
}
