package com.example.user1.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    Button b1, b2, b3, b4;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        setTitle("계산기");

        init();
    }
    void init(){
        e1 = (EditText)findViewById(R.id.editText10);
        e2 = (EditText)findViewById(R.id.editText11);
        b1 = (Button)findViewById(R.id.button11);
        b2 = (Button)findViewById(R.id.button12);
        b3 = (Button)findViewById(R.id.button13);
        b4 = (Button)findViewById(R.id.button14);

        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("") || e2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_LONG).show();
                } else{
                    int num1 = Integer.parseInt(e1.getText().toString());
                    int num2 = Integer.parseInt(e2.getText().toString());
                    int result = num1 + num2;

                    Toast.makeText(getApplicationContext(),"더하기 계산 결과는 "+result+"입니다",Toast.LENGTH_LONG).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("") || e2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_LONG).show();
                } else{
                    int num1 = Integer.parseInt(e1.getText().toString());
                    int num2 = Integer.parseInt(e2.getText().toString());
                    int result = num1 - num2;

                    Toast.makeText(getApplicationContext(),"빼기 계산 결과는 "+result+"입니다",Toast.LENGTH_LONG).show();
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("") || e2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_LONG).show();
                } else{
                    int num1 = Integer.parseInt(e1.getText().toString());
                    int num2 = Integer.parseInt(e2.getText().toString());
                    int result = num1 * num2;

                    Toast.makeText(getApplicationContext(),"곱하기 계산 결과는 "+result+"입니다",Toast.LENGTH_LONG).show();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("") || e2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_LONG).show();
                } else{
                    int num1 = Integer.parseInt(e1.getText().toString());
                    int num2 = Integer.parseInt(e2.getText().toString());
                    int result = num1 / num2;

                    Toast.makeText(getApplicationContext(),"나누기 계산 결과는 "+result+"입니다",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}

