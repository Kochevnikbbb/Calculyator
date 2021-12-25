package com.nomad.calculyator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvResult;
    private Float mValueOne, mValueTwo;
    private Boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    private Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonPlus, buttonMinus, buttonDivide,
            buttonMul, buttonTochka, buttonC, buttonEqual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.result);
        button0 = findViewById(R.id.zero);
        button1 = findViewById(R.id.one);
        button2 = findViewById(R.id.two);
        button3 = findViewById(R.id.three);
        button4 = findViewById(R.id.four);
        button5 = findViewById(R.id.five);
        button6 = findViewById(R.id.six);
        button7 = findViewById(R.id.seven);
        button8 = findViewById(R.id.eight);
        button9 = findViewById(R.id.nine);
        buttonTochka = findViewById(R.id.tochka);
        buttonPlus = findViewById(R.id.plus);
        buttonMinus = findViewById(R.id.minus);
        buttonMul = findViewById(R.id.multiply);
        buttonDivide = findViewById(R.id.divide);
        buttonC = findViewById(R.id.clean);
        buttonEqual = findViewById(R.id.equals);

        button0.setOnClickListener(view ->

        {
            tvResult.setText(tvResult.getText() + "0");
        });
        button1.setOnClickListener(view ->

        {
            tvResult.setText(tvResult.getText() + "1");
        });
        button2.setOnClickListener(view ->

        {
            tvResult.setText(tvResult.getText() + "2");
        });
        button3.setOnClickListener(view ->

        {
            tvResult.setText(tvResult.getText() + "3");
        });
        button4.setOnClickListener(view ->

        {
            tvResult.setText(tvResult.getText() + "4");
        });
        button5.setOnClickListener(view ->

        {
            tvResult.setText(tvResult.getText() + "5");
        });
        button6.setOnClickListener(view ->

        {
            tvResult.setText(tvResult.getText() + "6");
        });
        button7.setOnClickListener(view ->

        {
            tvResult.setText(tvResult.getText() + "7");
        });
        button8.setOnClickListener(view ->

        {
            tvResult.setText(tvResult.getText() + "8");
        });
        button9.setOnClickListener(view ->

        {
            tvResult.setText(tvResult.getText() + "9");
        });
        buttonPlus.setOnClickListener(view ->

        {
            if (tvResult == null) {
                tvResult.setText("");
            } else {
                mValueOne = Float.parseFloat(tvResult.getText() + "");
                crunchifyAddition = true;
                tvResult.setText(null);
            }
            buttonMinus.setOnClickListener(view1 -> {
                mValueOne = Float.parseFloat(tvResult.getText() + "");
                mSubtract = true;
                tvResult.setText(null);
            });
            buttonMul.setOnClickListener(view1 -> {
                mValueOne = Float.parseFloat(tvResult.getText() + "");
                crunchifyMultiplication = true;
                tvResult.setText(null);
            });
            buttonDivide.setOnClickListener(view1 -> {
                mValueOne = Float.parseFloat(tvResult.getText() + "");
                crunchifyMultiplication = true;
                tvResult.setText(null);
            });
            buttonEqual.setOnClickListener(view1 -> {
                mValueTwo = Float.parseFloat(tvResult.getText() + "");

                if (crunchifyAddition == true) {
                    tvResult.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    tvResult.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    tvResult.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    tvResult.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
            });
            buttonC.setOnClickListener(view1 -> {
                tvResult.setText("0");
            });
            buttonTochka.setOnClickListener(view1 -> {
                tvResult.setText(tvResult.getText() + ".");
            });
        });
    }


    public void onClickOperation(View view) {
    }

    public void onClickNumber(View view) {
    }


    /*    public void onClickNumber(View view) {
     *//*        double[] numbers ={R.id.one,R.id.two,R.id.three,R.id.four,R.id.five,R.id.six,R.id.seven,R.id.eight,R.id.nine,R.id.zero,R.id.tochka,R.id.negative_number};
        double x = 0;

        for (double i:numbers){
            x++;
            Button b=findViewById(numbers[i]);
            switch (view.getId()){
                case numbers[i]:
                    if (result.getText().toString().equals("0")){
                        result.setText("x");
                    }else{
                        result.append("x");
                    }
                    break;
            }
        }*//*

        switch (view.getId()) {
            case R.id.one:
                if (result.getText().toString().equals("0")) {
                    result.setText("1");
                } else {
                    result.append("1");
                }
                if (isClickOperation) {
                    result.setText("1");
                }
                break;
            case R.id.two:
                if (result.getText().toString().equals("0")) {
                    result.setText("2");
                } else {
                    result.append("2");
                }
                if (isClickOperation) {
                    result.setText("2");
                }
                break;
            case R.id.three:
                if (result.getText().toString().equals("0")) {
                    result.setText("3");
                } else {
                    result.append("3");
                }
                if (isClickOperation) {
                    result.setText("3");
                }
                break;
            case R.id.four:
                if (result.getText().toString().equals("0")) {
                    result.setText("4");
                } else {
                    result.append("4");
                }
                if (isClickOperation) {
                    result.setText("4");
                }
                break;
            case R.id.five:
                if (result.getText().toString().equals("0")) {
                    result.setText("5");
                } else {
                    result.append("5");
                }
                if (isClickOperation) {
                    result.setText("5");
                }
                break;
            case R.id.six:
                if (result.getText().toString().equals("0")) {
                    result.setText("6");
                } else {
                    result.append("6");
                }
                if (isClickOperation) {
                    result.setText("6");
                }
                break;
            case R.id.seven:
                if (result.getText().toString().equals("0")) {
                    result.setText("7");
                } else {
                    result.append("7");
                }
                if (isClickOperation) {
                    result.setText("7");
                }
                break;
            case R.id.eight:
                if (result.getText().toString().equals("0")) {
                    result.setText("8");
                } else {
                    result.append("8");
                }
                if (isClickOperation) {
                    result.setText("8");
                }
                break;
            case R.id.nine:
                if (result.getText().toString().equals("0")) {
                    result.setText("9");
                } else {
                    result.append("9");
                }
                if (isClickOperation) {
                    result.setText("9");
                }
                break;
            case R.id.zero:
                if (result.getText().toString().equals("0")) {
                    result.setText("0");
                } else {
                    result.append("0");
                }
                if (isClickOperation) {
                    result.setText("0");
                }
                break;
            case R.id.negative_number:
                if (result.getText().toString().equals("0")) {
                    result.setText("-");
                } else {
                    result.append("-");
                }
                if (isClickOperation) {
                    result.setText("-");
                }
                break;
            case R.id.tochka:
                if (result.getText().toString().equals("0")) {
                    result.setText(".");
                } else {
                    result.append(".");
                }
        }
        isClickOperation = false;
    }

    public void onClickOperation(View view) {
        switch (view.getId()) {
            case R.id.plus:
                first = Integer.parseInt(result.getText().toString());
                operation = "+";
                isClickOperation = true;
                break;
            case R.id.minus:
                first = Integer.parseInt(result.getText().toString());
                operation = "-";
                isClickOperation = true;
                break;
            case R.id.multiply:
                first = Integer.parseInt(result.getText().toString());
                operation = "*";
                isClickOperation = true;
                break;
            case R.id.divide:
                first = Integer.parseInt(result.getText().toString());
                operation = "/";
                isClickOperation = true;
                break;
            case R.id.clean:
                result.setText("0");
                break;
            case R.id.equals:

                second = Integer.parseInt(result.getText().toString());
                Integer res = 0;

                switch (operation) {
                    case "+":
                        res = first + second;
                    case "*":
                        res = first * second;
                    case "/":
                        res = first / second;
                    case "-":
                        res = first - second;
                }
                result.setText(res.toString());
                isClickOperation = true;
                break;

        }

    }*/

}