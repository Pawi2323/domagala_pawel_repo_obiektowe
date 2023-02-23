import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 23456);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            Scanner sc = new Scanner(System.in);
            while(true){
                String ans = in.readUTF();
                System.out.println(ans);
                ans = sc.nextLine();
                if(ans.equalsIgnoreCase("quit")){
                    try {
                        in.close();
                        out.close();
                        socket.close();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
                out.writeUTF(ans);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
