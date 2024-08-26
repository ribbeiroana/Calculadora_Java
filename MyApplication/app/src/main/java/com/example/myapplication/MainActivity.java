package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double num1,num2,res;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.Layout.activity_main);


        Button btn_somar = (Button) findViewById(R.id.btn_soma);
        Button btn_subtrair = (Button) findViewById(R.id.btn_subtrai);
        Button btn_multiplicar = (Button) findViewById(R.id.btn_multiplica);
        Button btn_dividir = (Button) findviewById(R.id.btn_divide);

        Textview tv_resultado = (TextView) findViewById(R.id.tv_resultado);
        EditText et_valorl = (EditText) findViewById(R.id.et_vator1);
        EditText et_valor2 = (EditText) findViewById(R.id.et_valor2);

        btn_somar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               num1=Double.parseDouble(et_valor1.getText().toString());
               num2=Double.parseDouble(et_valor2.getText().toString());
               res=num1+num2;
               tv_resultado.setText(String.valueOf(res));
            }
        });
        btn_subtrair.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1=Double.parseDouble(et_valor1.getText().toString());
                num2=Double.parseDouble(et_valor2.getText().toString());
                res=num1-num2;
                tv_resultado.setText(String.valueOf(res));
            }
        });
        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1=Double.parseDouble(et_valor1.getText().toString());
                num2=Double.parseDouble(et_valor2.getText().toString());
                res=num1*num2;
                tv_resultado.setText(String.valueOf(res));
            }
        });
        btn_dividir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1=Double.parseDouble(et_valor1.getText().toString());
                num2=Double.parseDouble(et_valor2.getText().toString());
                res=num1/num2;
                tv_resultado.setText(String.valueOf(res));
            }
        });
    }
}