package com.example.sujay.signin;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    DatabaseHelper mydb;
    EditText username,password;
    Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        signin=(Button)findViewById(R.id.signin);
        mydb=new DatabaseHelper(this);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x=username.getText().toString();
                String y=password.getText().toString();
                Cursor res=mydb.getAllData();
                while(res.moveToNext()){
                    if(x.compareTo(res.getString(0))==0 && y.compareTo(res.getString(1))==0){
                        Toast.makeText(SignIn.this, "Successfully signed in", Toast.LENGTH_SHORT).show();
                        Intent i=new Intent(SignIn.this,Success.class);
                        i.putExtra("Username",res.getString(0));
                        startActivity(i);
                    }
                }

            }
        });
    }
}
