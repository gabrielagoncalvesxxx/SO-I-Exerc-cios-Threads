import java.util.Random;
public class MatrixSumExample {
    public static void main(String[] args) {
        int[][] matrix = new int[3][5];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = random.nextInt(100); 
            }
        }
        for (int i = 0; i < 3; i++) {
            int[] row = matrix[i];
            int rowIndex = i;
            Thread thread = new Thread(() -> {
                int sum = 0;
                for (int value : row) {
                    sum += value;
                }
                System.out.println("Linha " + rowIndex + " - Soma: " + sum);
            });
            thread.start();
        }
    }
}