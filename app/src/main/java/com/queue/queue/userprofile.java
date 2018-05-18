package com.queue.queue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class userprofile extends AppCompatActivity {

    TextView username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);


        String name = getIntent().getStringExtra("username");

        username = (TextView) findViewById(R.id.name);
        username.setText(name);
        









    }
}
