package com.example.cnssevilleno.myapplication;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.pedromassango.doubleclick.DoubleClick;
import com.pedromassango.doubleclick.DoubleClickListener;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    public EditText inputDisp;
    public View v;
    public TextView resultDisp;
    public String equation;
    public int sum;
    public Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven,btnEight, btnNine, btnZero, btnPlus, btnEquals;
    public int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputDisp = (EditText) findViewById(R.id.input);
        resultDisp = (TextView) findViewById(R.id.result);
        btnOne = (Button) findViewById(R.id.btn1);
        btnTwo = (Button) findViewById(R.id.btn2);
        btnThree = (Button) findViewById(R.id.btn3);
        btnFour = (Button) findViewById(R.id.btn4);
        btnFive = (Button) findViewById(R.id.btn5);
        btnSix = (Button) findViewById(R.id.btn6);
        btnSeven = (Button) findViewById(R.id.btn7);
        btnEight = (Button) findViewById(R.id.btn8);
        btnNine = (Button) findViewById(R.id.btn9);
        btnZero = (Button) findViewById(R.id.btn0);
        btnPlus = (Button) findViewById(R.id.btn11);
        btnEquals = (Button) findViewById(R.id.btn12);

        btnOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                inputDisp.append("1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                inputDisp.append("2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                inputDisp.append("3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                inputDisp.append("4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                inputDisp.append("5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                inputDisp.append("6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                inputDisp.append("7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                inputDisp.append("8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                inputDisp.append("9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                inputDisp.append("0");
            }
        });


        btnPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count++;
                Handler handler = new Handler();
                Runnable r = new Runnable() {
                    @Override
                    public void run() {
                        count = 0;
                    }
                };

                if (count == 1) {
                    //Single click
                    handler.postDelayed(r, 250);
                    inputDisp.append("+");
                } else if (count == 2) {
                    //Double click
                    count = 0;
                    inputDisp.setText("");
                    resultDisp.setText("");
                }
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                equation = inputDisp.getText().toString();
                String[] temp = equation.split("\\+");
                int[] integers = new int[temp.length];
                for (int i = 0; i < integers.length; i++){
                    integers[i] = Integer.parseInt(temp[i]);
                    sum += integers[i];
                }
                resultDisp.setText(sum+"");
            }
        });

    }
//    public void getSum(String equation){
//
//        Toast.makeText(this, asd, Toast.LENGTH_SHORT).show();
//
//    }
}

