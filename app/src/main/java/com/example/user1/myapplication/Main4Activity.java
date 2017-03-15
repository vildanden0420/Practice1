package com.example.user1.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    Button b1, b2;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setTitle("온도 변환기");
        init();
    }

    void init(){
        e1 = (EditText)findViewById(R.id.editText5);
        e2 = (EditText)findViewById(R.id.editText6);
        b1 = (Button)findViewById(R.id.button8);
        b2 = (Button)findViewById(R.id.button9);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String celsius = e1.getText().toString();
                Double result = Double.parseDouble(celsius)*1.8 + 32;

                Toast.makeText(getApplicationContext(),"화씨 온도는 " + result + "도 입니다.",Toast.LENGTH_LONG).show();


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fahre = e2.getText().toString();
                Double result = (Double.parseDouble(fahre)-32)/1.8;

                Toast.makeText(getApplicationContext(),"섭씨 온도는 " + result + "도 입니다.",Toast.LENGTH_LONG).show();


            }
        });
    }
}
