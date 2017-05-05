import java.io.IOException;
import java.net.Socket;

public class GCDataGenerator {

    String server;
    int port;
    Socket socket;

    public GCDataGenerator() throws IOException {
        this.server = "localhost";
        this.port = 9090;
        this.socket = new Socket(server, port);
    }

    public static void main(String[] args) {
        try {
            GCDataGenerator dataGenerator = new GCDataGenerator();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
