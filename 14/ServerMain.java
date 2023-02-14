import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain{
    public static void main(String[] args) {
            try {
                ServerSocket server = new ServerSocket(23456);
                Socket socket = server.accept();
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                DataInputStream in = new DataInputStream(socket.getInputStream());
                Scanner sc = new Scanner(System.in);
                try {
                    out.writeUTF("Podaj dwie liczby: ");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                while(true){
                    String ans = in.readUTF();
                    System.out.println(ans);
                    String[] liczby = ans.split(";");
                    int l1 = liczby[0];
                    int l2 = liczby[1];
                    // ans = sc.nextLine();
                    // out.writeUTF(ans);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}