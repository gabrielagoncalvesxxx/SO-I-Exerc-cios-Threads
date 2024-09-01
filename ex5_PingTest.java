public class PingTest {
    public static void main(String[] args) {
        String os = System.getProperty("os.name").toLowerCase();
        if (!os.contains("linux")) {
            System.out.println("Este programa só pode ser executado em Sistemas Operacionais Linux.");
            return;
        }

        Thread uolPing = new PingThread("www.uol.com.br", "UOL");
        Thread terraPing = new PingThread("www.terra.com.br", "Terra");
        Thread googlePing = new PingThread("www.google.com.br", "Google");

        uolPing.start();
        terraPing.start();
        googlePing.start();
    }
}
