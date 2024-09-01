public class ThreadExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                // Remove the duplicate declaration
                // int id = (int) Thread.currentThread().getId();
                System.out.println("Thread ID: " + (int) Thread.currentThread().getId()); 
            });
            thread.start();
        }
    }
}