package ru.fizteh.fivt.students.VasilevKirill.telnet.Threads;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Kirill on 06.12.2014.
 */
public class ClientThread implements Runnable {
    private ServerSocket serverSocket;

    public ClientThread(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    @Override
    public void run() {
        try {
            Socket socket = serverSocket.accept();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}