package com.queue.queue;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.*;
import java.io.*;
import java.util.Set;
import static com.queue.queue.SocketHandler.setSocket;


public class FirstScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=2000;
    private  static Socket clientSocket;
    Socket s;
    DataOutputStream dos;
    PrintWriter pw;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        try
        {
            s=new Socket("192.168.0.119",8220);
            pw = new PrintWriter(s.getOutputStream());
            pw.write("201$");
            pw.flush();
            pw.close();
            s.close();




        }catch (Exception e)
        {

        }


       new Handler().postDelayed(new Runnable(){
           @Override
           public void run()
           {

               Intent i =new Intent(FirstScreen.this,SecScreen.class);
               startActivity(i);
               finish();
           }


       },SPLASH_TIME_OUT);
    }



}
