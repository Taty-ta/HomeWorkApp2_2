package hw_6_1_1.hw_6_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    static Socket socket = null;

    private static final int PORT = 8189;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (ServerSocket server = new ServerSocket(PORT);) {

            System.out.println("Server started!");

            socket = server.accept();// серверный метод сервер ждет пока к нему кто нибудь подключится
            System.out.println("Client connected");


            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            // на сервере что то написали
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
            while (true) {

                String str = in.readUTF();
                if (str.equals("/end")) { // если прислали косую черту
                    System.out.println("Client disconnected");
                    break;
                }else {
                    System.out.println("Client " + str);// выводим сообщения в консоль и
                }
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();// в блоке файнали сервер нужно закрыть
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
