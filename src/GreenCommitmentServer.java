import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class GreenCommitmentServer {

    int port;
    ServerSocket server;
    Socket socket;
    InputStreamReader in;


    public GreenCommitmentServer() throws IOException {
        this.port = 9090;
        this. server = new ServerSocket(port);
        this.socket = server.accept();
        this.in = new InputStreamReader(socket.getInputStream());
    }


}
