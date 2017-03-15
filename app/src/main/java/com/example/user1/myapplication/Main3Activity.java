package com.example.user1.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    EditText e1,e2;
    Button b1, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("나이 계산기");
        init();
    }

    void init(){
        e1 = (EditText)findViewById(R.id.editText3);
        e2 = (EditText)findViewById(R.id.editText4);
        b1 = (Button)findViewById(R.id.button6);
        b2 = (Button)findViewById(R.id.button7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String birth_year = e1.getText().toString();
                int result = 2017-Integer.parseInt(birth_year)+1;

                Toast.makeText(getApplicationContext(),"당신의 나이는 " + result + "세 입니다.",Toast.LENGTH_LONG).show();


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = e2.getText().toString();
                int result = 2017-Integer.parseInt(age)+1;

                Toast.makeText(getApplicationContext(),"당신의 태어난 해는 " + result + " 입니다.",Toast.LENGTH_LONG).show();
            }
        });
    }
}
