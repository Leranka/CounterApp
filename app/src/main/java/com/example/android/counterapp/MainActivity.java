package com.example.android.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCounter = 0;
    Button btn;
    TextView txv;

    private int nCounter = 0;
    Button btn2,reset;
    TextView txv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn1);
        txv = (TextView) findViewById(R.id.text1);
        btn2 = (Button) findViewById(R.id.btn2);
        txv2 = (TextView) findViewById(R.id.text2);
        reset = (Button) findViewById(R.id.reset);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mCounter ++;
                txv.setText(Integer.toString(mCounter));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mCounter ++;
                txv.setText(Integer.toString(mCounter));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nCounter ++;
                txv2.setText(Integer.toString(nCounter));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nCounter = 0;
                mCounter = 0;
                txv2.setText(Integer.toString(nCounter));
                txv.setText(Integer.toString(mCounter));
            }
        });


    }
}
