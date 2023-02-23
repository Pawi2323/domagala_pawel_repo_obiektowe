import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.ArrayList;

public class ServerMain{
    public static void main(String[] args) {
            try {
                ServerSocket server = new ServerSocket(23456);
                Socket socket = server.accept();
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                DataInputStream in = new DataInputStream(socket.getInputStream());
                Scanner sc = new Scanner(System.in);
                ArrayList<String> slowa = new ArrayList<String>();
                slowa.add("test");
                try {
                    out.writeUTF("Podaj slowo, lub wyswietl liste (1)");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                while(true){
                    String ans = in.readUTF();
                    ans = ans.toLowerCase();
                    System.out.println(ans);
                    if(slowa.contains(ans)) out.writeUTF("Podane słowo już nam podaj inne / wyswietl liste (1)");
                    else if(ans.equals("1")){
                        out.writeUTF(slowa.toString());
                    }
                    else {
                        slowa.add(ans);
                        out.writeUTF("Dodano nowe słowo, jeśli chcesz wyświetlić listę słów wpisz: 1");
                    }
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
