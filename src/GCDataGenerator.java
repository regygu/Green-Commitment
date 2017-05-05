import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Random;

public class GCDataGenerator {

    String server;
    int port;
    Socket socket;
    PrintStream out;
    Document document;

    public GCDataGenerator() throws IOException {
        this.server = "localhost";
        this.port = 9090;
        this.socket = new Socket(server, port);
        this.out = new PrintStream(socket.getOutputStream());
    }

    public static void main(String[] args) {
        try {
            GCDataGenerator dataGenerator = new GCDataGenerator();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createData() throws ParserConfigurationException {

        int measurementX;
        int measurementY;

        Random random = new Random();

        measurementX = random.nextInt(100) + 1;
        measurementY = random.nextInt(100) + 1;

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();

        Element measurement = doc.createElement("measurement");
        doc.appendChild(measurement);
        Element rate = doc.createElement("rate");
        rate.setAttribute("x", String.valueOf(measurementX));
        rate.setAttribute("y", String.valueOf(measurementY));
        measurement.appendChild(rate);

        document = doc;

    }

}
