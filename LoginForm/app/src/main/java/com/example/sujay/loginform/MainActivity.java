package com.example.sujay.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String uname="sj";
    String upass="sj";
    EditText username,password,attemptCount;
    Button login;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        attemptCount=(EditText)findViewById(R.id.attemptCount);
        login=(Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count=Integer.parseInt(attemptCount.getText().toString());
                if(count!=0){
                    if(uname.compareTo(username.getText().toString())==0 && upass.compareTo(password.getText().toString())==0)
                        Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    else {
                        count--;
                        attemptCount.setText(Integer.toString(count));
                    }
                }
                else {
                    attemptCount.setText(Integer.toString(count));
                    Toast.makeText(MainActivity.this, "Attempts Exhausted", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
