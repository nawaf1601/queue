package com.queue.queue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.net.InetAddress;
import java.net.Socket;



public class Sign_Up extends AppCompatActivity {
    Button Signup;
    EditText usernameEditText;
    EditText passwordEditText;
    TextView notes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);



        usernameEditText= (EditText) findViewById(R.id.name);
        passwordEditText= (EditText) findViewById(R.id.password);
        notes=(TextView)findViewById(R.id.notes);

        Signup=(Button)findViewById(R.id.signupbtn);
        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (passwordEditText.getText().toString().length()<4||passwordEditText.getText().toString().length()>20 || usernameEditText.getText().toString().length()>20||usernameEditText.getText().toString().length()<4){
                    notes.setText("the input must be between 4 and 20 chars");
                }
                else {
                    Intent i = new Intent(Sign_Up.this, Home.class);
                    i.putExtra("name",usernameEditText.getText().toString());
                    startActivity(i);


                }
            }
        });

    }
}