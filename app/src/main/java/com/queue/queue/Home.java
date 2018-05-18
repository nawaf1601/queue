package com.queue.queue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView username;
    ImageButton userprofile;
    ImageButton search;
    ImageButton addroom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        username = (TextView) findViewById(R.id.username);
        String name = getIntent().getStringExtra("name");
        username.setText("    "+name);

        userprofile = (ImageButton) findViewById(R.id.user);
        userprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,userprofile.class);
                i.putExtra("username",username.getText().toString());
                startActivity(i);
            }
        });

        search=(ImageButton)findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,Searchforroom.class);
                startActivity(i);
            }
        });
        addroom=(ImageButton)findViewById(R.id.addroom);
        addroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,addroom.class);
                startActivity(i);
            }
        });










    }
}
