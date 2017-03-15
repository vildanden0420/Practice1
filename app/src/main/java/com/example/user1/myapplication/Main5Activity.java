package com.example.user1.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    Button b1;
    EditText e1, e2, e3;
    CheckBox c1;
    TextView t1, t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        setTitle("레스토랑 메뉴 주문");
        init();

    }

    void init(){
        e1 = (EditText)findViewById(R.id.editText7);
        e2 = (EditText)findViewById(R.id.editText8);
        e3 = (EditText)findViewById(R.id.editText9);
        b1 = (Button)findViewById(R.id.button10);
        c1 = (CheckBox)findViewById(R.id.checkBox);
        t1 = (TextView)findViewById(R.id.textView11);
        t2 = (TextView)findViewById(R.id.textView13);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pizza = e1.getText().toString();
                int pizzaCount = 0;
                if(!pizza.equals("")){
                    pizzaCount = Integer.parseInt(pizza);
                }

                String pasta = e2.getText().toString();
                int pastaCount = 0;
                if(!pasta.equals("")){
                    pastaCount = Integer.parseInt(pasta);
                }

                String salad = e3.getText().toString();
                int saladCount = 0;
                if(!salad.equals("")){
                    saladCount = Integer.parseInt(salad);
                }

                int totalCount = pizzaCount + pastaCount + saladCount;
                int price = pizzaCount*15000 + pastaCount*13000 + saladCount*9000;

                if(c1.isChecked() == true) {
                    price = (price * 9) / 10;
                }

                t1.setText(""+totalCount);
                t2.setText(""+price);

            }
        });
    }
}
