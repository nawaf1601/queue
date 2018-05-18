package com.queue.queue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import static com.queue.queue.SocketHandler.getSocket;
import java.net.Socket;

public class SecScreen extends AppCompatActivity {

    Button ContinueAsaGuest;
    Button ContinueAsanAdmin;
    Socket clientSocket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_screen);

        Socket clientSocket;
        clientSocket= getSocket();

        ContinueAsaGuest = (Button) findViewById(R.id.Guestbtn);
        ContinueAsaGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SecScreen.this, Sign_Up.class);
                startActivity(i);

            }

        });

        ContinueAsanAdmin=(Button)findViewById(R.id.Adminbtn);
        ContinueAsanAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SecScreen.this, SIGNINAADMIN.class);
                startActivity(i);}});
    }}
