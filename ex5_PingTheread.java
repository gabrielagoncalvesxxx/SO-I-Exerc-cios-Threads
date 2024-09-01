import java.io.BufferedReader;
import java.io.InputStreamReader;

class PingThread extends Thread {
    private String servidor;
    private String nomeServidor;

    public PingThread(String servidor, String nomeServidor) {
        this.servidor = servidor;
        this.nomeServidor = nomeServidor;
    }

    @Override
    public void run() {
        try {
            Process process = Runtime.getRuntime().exec("ping -4 -c 10 " + servidor);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            double somaTempo = 0;
            int contagem = 0;

            while ((line = reader.readLine()) != null) {
                if (line.contains("time=")) {
                    String tempoStr = line.split("time=")[1].split(" ")[0];
                    double tempo = Double.parseDouble(tempoStr);
                    somaTempo += tempo;
                    contagem++;
                    System.out.println(nomeServidor + " - Iteração " + contagem + ": " + tempo + " ms");
                }
            }

            double tempoMedio = somaTempo / contagem;
            System.out.println(nomeServidor + " - Tempo médio: " + tempoMedio + " ms");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
