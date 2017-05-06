package com.example.sujay.factorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String x,y;
    int n,i;
    long fact=1;
    private EditText number;
    private EditText resultFact;
    private Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText number=(EditText)findViewById(R.id.number);
        final EditText resultFact=(EditText)findViewById(R.id.result);
        submitButton=(Button)findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fact=1;
                x = number.getText().toString();
                n = Integer.parseInt(x);
                for (i = 1; i <=n; i++)
                    fact = fact * i;
                y = Long.toString(fact);
                resultFact.setText(y);

            }
        });
    }
}
