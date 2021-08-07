package hw_6_1_1.hw_6_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String SERVER_ADDR = "localhost";
    private static final int SERVER_PORT = 8189;

    public static void main(String[] args) {
        Socket socket = null;
        Scanner sc = new Scanner(System.in);
        try {
            socket = new Socket(SERVER_ADDR, SERVER_PORT); // создали сокер и сказали куда подключаться
            System.out.println("Подключен к серверу" + socket.getRemoteSocketAddress()); // метов возвращающий адрес


            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());

            Thread t1 = new Thread(() -> {
                while (true) {
                    try {
                        out.writeUTF(sc.nextLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            t1.start();

            // клиент получил
            while (true) {

                String str = in.readUTF();
                if (str.equals("/end")) { // если прислали косую черту
                    System.out.println("Server disconnected");
                    break;
                }else {
                    System.out.println("Server " + str);// выводим сообщения в консоль и
                }
        }

    } catch(
    IOException e)

    {
        e.printStackTrace();
    } finally

    {
        try {
            socket.close();// в блоке файнали сервер нужно закрыть
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

}