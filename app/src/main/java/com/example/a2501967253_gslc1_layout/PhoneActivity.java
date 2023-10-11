package com.example.a2501967253_gslc1_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PhoneActivity extends AppCompatActivity {
    TextView inputText, resultText;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnCancel, btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        inputText = findViewById(R.id.inputTextView);
        resultText = findViewById(R.id.resultTextView);

        btn1 = findViewById(R.id.Btn1);
        btn2 = findViewById(R.id.Btn2);
        btn3 = findViewById(R.id.Btn3);
        btn4 = findViewById(R.id.Btn4);
        btn5 = findViewById(R.id.Btn5);
        btn6 = findViewById(R.id.Btn6);
        btn7 = findViewById(R.id.Btn7);
        btn8 = findViewById(R.id.Btn8);
        btn9 = findViewById(R.id.Btn9);
        btn0 = findViewById(R.id.Btn0);
        btnCancel = findViewById(R.id.BtnCancel);
        btnCall = findViewById(R.id.BtnCall);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.append("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.append("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.append("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.append("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.append("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.append("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.append("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.append("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.append("9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.append("0");
            }
        });
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setVisibility(View.VISIBLE);
                resultText.setText("Calling");

                Handler h1 = new Handler();
                for(int i = 0; i<3; i++){
                    h1.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            resultText.append(".");
                        }
                    }, 1000);
                }

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        resultText.setText("");
                        inputText.setText("");
                    }
                }, 3000);
            }

        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText("");
                inputText.setText("");
            }
        });

    }
}