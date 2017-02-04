package com.example.yan.buttoni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NEVLADIMIR(View view) {
        EditText ed = (EditText) findViewById(R.id.ed);
        String s = ed.getText().toString();

        TextView tv1 = (TextView) findViewById(R.id.tv1);// r = recyrci
        tv1.setText("Здравствуй, о повелитель, "+s+"!");
    }

    public void DOCVIDULI(View view) {
        TextView tv1 = (TextView) findViewById(R.id.tv1);// r = recyrci
        tv1.setText("DOCVIDULI");
    }
}
