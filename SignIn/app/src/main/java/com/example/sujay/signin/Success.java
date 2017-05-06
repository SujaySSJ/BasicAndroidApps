package com.example.sujay.signin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Success extends AppCompatActivity {
    Button logout;
    EditText username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        username=(EditText)findViewById(R.id.uname);
        logout=(Button)findViewById(R.id.logout);
        String x=getIntent().getExtras().getString("Username");
        username.setText(x);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Success.this,MainActivity.class));
            }
        });

    }
}
