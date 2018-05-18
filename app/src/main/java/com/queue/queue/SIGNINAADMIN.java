package com.queue.queue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.net.Socket;



public class SIGNINAADMIN extends AppCompatActivity {

    Button Signin;
    EditText usernameEditText;
    EditText passwordEditText;
    TextView notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signinaadmin);


        usernameEditText= (EditText) findViewById(R.id.name);
        passwordEditText= (EditText) findViewById(R.id.password);
        notes=(TextView)findViewById(R.id.notes);



        Signin = (Button) findViewById(R.id.signinbtn);
            Signin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (passwordEditText.getText().toString().length()<4||passwordEditText.getText().toString().length()>20 || usernameEditText.getText().toString().length()>20||usernameEditText.getText().toString().length()<4){
                        notes.setText("the input must be between 4 and 20 chars");
                    } else {



                        Intent i = new Intent(SIGNINAADMIN.this, Home.class);
                        i.putExtra("name",usernameEditText.getText().toString());
                        startActivity(i);
                    }
                }
            });


    }
}
