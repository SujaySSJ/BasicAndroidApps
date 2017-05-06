package com.example.sujay.signin;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    DatabaseHelper mydb;
    EditText username,password;
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        signup=(Button)findViewById(R.id.signup);
        mydb=new DatabaseHelper(this);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = username.getText().toString();
                String y = password.getText().toString();
                boolean isInserted = mydb.insertData(x, y);

                if (isInserted == true){
                    Toast.makeText(SignUp.this, "Signup Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(SignUp.this,MainActivity.class));
                }
                else Toast.makeText(SignUp.this, "Unsuccessful", Toast.LENGTH_SHORT).show();


            }
        });
    }
    public void showMessage(String Title, String Message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(Title);
        builder.setMessage(Message);
    }
}
