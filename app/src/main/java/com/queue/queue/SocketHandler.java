package com.queue.queue;

import java.net.Socket;

/**
 * Created by User on 05/11/2018.
 */

public class SocketHandler {
    private static Socket socket;

    public static synchronized Socket getSocket(){
        return socket;
    }

    public static synchronized void setSocket(Socket socket){
        SocketHandler.socket = socket;
    }


}