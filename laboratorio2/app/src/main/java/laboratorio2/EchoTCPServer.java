package laboratorio2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import laboratorio2.number.index;
import laboratorio2.segmentacionCadenas.SegmentacionCadenas;

public class EchoTCPServer {
    SegmentacionCadenas segmentarCadenas = new SegmentacionCadenas();

    public static final int PORT = 3400;

    private ServerSocket listener;
    private Socket serverSideSocket;

    private PrintWriter toNetwork;
    private BufferedReader fromNetwork;

    public EchoTCPServer() {
        System.out.println("Echo TCP server is running on port: " + PORT);
    }

    public void init() throws Exception {
        listener = new ServerSocket(PORT);

        while (true) {
            serverSideSocket = listener.accept();

            createStreams(serverSideSocket);
            protocol(serverSideSocket);
        }
    }

    public void protocol(Socket socket) throws Exception {
        String message = fromNetwork.readLine();
        System.out.println("[Server] From client: " + message);

        String answer = identificarFuncion(message);

        toNetwork.println(answer);
    }

    private String identificarFuncion(String message) {
        String[] cad = message.split(" ");
        String answer = "";
        if (cad[0].equals("GEN-CAD")) {
            answer = segmentarCadenas.generarCadena(Integer.parseInt(cad[1]));

            if (cad.length >= 3) {
                String[] cd = segmentarCadenas.dividirCadena(answer, Integer.parseInt(cad[2]));
                answer = "";
                for (int i = 0; i < cd.length; i++) {
                    answer += cd[i];
                    if (cd.length - 1 != i) {
                        answer += ", ";
                    }
                }
            }
        } else {
            index inde = new index();
            if (inde.comprobarSolicitud((cad[0])) >= 0 && inde.comprobarSolicitud((cad[0])) <= 2) {
                answer = inde.solicitud(message, cad);
            } else {
                if (cad[0].equals(("CAD-SEG"))) {
                    SegmentacionCadenas seg = new SegmentacionCadenas();
                    answer = seg.dividirCadenaSegmentos(cad[1], Integer.parseInt(cad[2]), Integer.parseInt((cad[3])),
                            Integer.parseInt((cad[4])));
                }
            }
        }
        return answer;
    }

    private void createStreams(Socket socket) throws Exception {
        toNetwork = new PrintWriter(socket.getOutputStream(), true);
        fromNetwork = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    public static void main(String args[]) throws Exception {
        EchoTCPServer es = new EchoTCPServer();
        es.init();
    }
}
