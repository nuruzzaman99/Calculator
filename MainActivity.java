package com.example.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    String process;
    TextView textView1, textView2;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, addition, equal, percent,
            clear, bracket, power, division, multiplication, subtraction, decimal;
    boolean checkBracket = false;
    int num, ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);

        btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process + "0");
        });

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process + "1");
        });

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process + "2");
        });

        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process + "3");
        });

        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process + "4");
        });

        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process + "5");
        });

        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process + "6");
        });

        btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process + "7");
        });

        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process + "8");
        });

        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process + "9");
        });

        addition = findViewById(R.id.addition);
        addition.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process + "+");
        });

        percent = findViewById(R.id.percent);
        percent.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process + "%");
        });

        bracket = findViewById(R.id.bracket);
        bracket.setOnClickListener(v -> {
            if(checkBracket){
                process = textView2.getText().toString();
                textView2.setText(process + ")");
                checkBracket = false;
            }
            else{
                process = textView2.getText().toString();
                textView2.setText(process + '(');
                checkBracket = true;
            }

        });

        power = findViewById(R.id.power);
        power.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process+"^");
        });

        division = findViewById(R.id.division);
        division.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process + "÷");
        });

        multiplication = findViewById(R.id.multiplication);
        multiplication.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process + "X");
        });

        subtraction = findViewById(R.id.subtraction);
        subtraction.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process + "-");
        });

        decimal = findViewById(R.id.decimal);
        decimal.setOnClickListener(v -> {
            process = textView2.getText().toString();
            textView2.setText(process + ".");
        });

        clear = findViewById(R.id.clear);
        clear.setOnClickListener(v -> {
            textView2.setText("");
            textView2.setText("");
        });

        equal = findViewById(R.id.equal);
        equal.setOnClickListener(v -> {
            process = textView2.getText().toString();

            process = process.replaceAll("X","*");
            process = process.replaceAll("%","/100");
            process = process.replaceAll("÷","/");



        });


    }
}