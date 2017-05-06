package com.example.sujay.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText number1,number2,result;
    Button add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=(EditText)findViewById(R.id.number1);
        number2=(EditText)findViewById(R.id.number2);
        result=(EditText)findViewById(R.id.result);
        add=(Button)findViewById(R.id.addbtn);
        sub=(Button)findViewById(R.id.subbtn);
        mul=(Button)findViewById(R.id.mulbtn);
        div=(Button)findViewById(R.id.divbtn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x=number1.getText().toString();
                String y=number2.getText().toString();
                if(x.equals(""))
                    x="0";
                if(y.equals(""))
                    y="0";
                double ans=Double.parseDouble(x)+Double.parseDouble(y);
                result.setText(Double.toString(ans));

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x=number1.getText().toString();
                String y=number2.getText().toString();
                if(x.equals(""))
                    x="0";
                if(y.equals(""))
                    y="0";
                double ans=Double.parseDouble(x)-Double.parseDouble(y);
                result.setText(Double.toString(ans));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x=number1.getText().toString();
                String y=number2.getText().toString();
                if(x.equals(""))
                    x="0";
                if(y.equals(""))
                    y="0";
                double ans=Double.parseDouble(x)*Double.parseDouble(y);
                result.setText(Double.toString(ans));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x=number1.getText().toString();
                String y=number2.getText().toString();
                if(x.equals(""))
                    x="0";
                if(y.equals(""))
                    y="0";
                double ans=Double.parseDouble(x)/Double.parseDouble(y);
                result.setText(Double.toString(ans));
            }
        });
    }

}
