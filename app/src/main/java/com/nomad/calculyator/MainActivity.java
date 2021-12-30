package com.nomad.calculyator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private TextView tvResult;
    private Double firstVal = Double.NaN, secondVal;
    private String operation;
    private boolean /*crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision,*/ isClickOperation = false;

/*    private Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonPlus, buttonMinus, buttonDivide,
            buttonMul, buttonTochka, buttonC, buttonEqual;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.result);

    }
/*        button0 = findViewById(R.id.zero);
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
                firstVal = Integer.parseInt(tvResult.getText() + "");
                crunchifyAddition = true;
                tvResult.setText(null);
            }
            buttonMinus.setOnClickListener(view1 -> {
                firstVal = Integer.parseInt(tvResult.getText() + "");
                mSubtract = true;
                tvResult.setText(null);
            });
            buttonMul.setOnClickListener(view1 -> {
                firstVal = Integer.parseInt(tvResult.getText() + "");
                crunchifyMultiplication = true;
                tvResult.setText(null);
            });
            buttonDivide.setOnClickListener(view1 -> {
                firstVal = Integer.parseInt(tvResult.getText() + "");
                crunchifyMultiplication = true;
                tvResult.setText(null);
            });
            buttonEqual.setOnClickListener(view1 -> {
                secondVal = Integer.parseInt(tvResult.getText() + "");

                if (crunchifyAddition == true) {
                    tvResult.setText(firstVal + secondVal + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    tvResult.setText(firstVal - secondVal);
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    tvResult.setText(+firstVal * secondVal + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    tvResult.setText(firstVal / secondVal + "");
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
    }*/


    public void onClickNumber(View view) {
        switch (view.getId()) {
            case R.id.one:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("1");
                } else {
                    tvResult.append("1");
                }
                if (isClickOperation) {
                    tvResult.setText("1");
                }
                break;
            case R.id.two:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("2");
                } else {
                    tvResult.append("2");
                }
                if (isClickOperation) {
                    tvResult.setText("2");
                }
                break;
            case R.id.three:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("3");
                } else {
                    tvResult.append("3");
                }
                if (isClickOperation) {
                    tvResult.setText("3");
                }
                break;
            case R.id.four:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("4");
                } else {
                    tvResult.append("4");
                }
                if (isClickOperation) {
                    tvResult.setText("4");
                }
                break;
            case R.id.five:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("5");
                } else {
                    tvResult.append("5");
                }
                if (isClickOperation) {
                    tvResult.setText("5");
                }
                break;
            case R.id.six:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("6");
                } else {
                    tvResult.append("6");
                }
                if (isClickOperation) {
                    tvResult.setText("6");
                }
                break;
            case R.id.seven:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("7");
                } else {
                    tvResult.append("7");
                }
                if (isClickOperation) {
                    tvResult.setText("7");
                }
                break;
            case R.id.eight:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("8");
                } else {
                    tvResult.append("8");
                }
                if (isClickOperation) {
                    tvResult.setText("8");
                }
                break;
            case R.id.nine:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("9");
                } else {
                    tvResult.append("9");
                }
                if (isClickOperation) {
                    tvResult.setText("9");
                }
                break;
            case R.id.zero:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("0");
                } else {
                    tvResult.append("0");
                }
                if (isClickOperation) {
                    tvResult.setText("0");
                }
                break;
            case R.id.negative_number:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("-");
                } else {
                    tvResult.append("-");
                }
                if (isClickOperation) {
                    tvResult.setText("-");
                }
                break;
            case R.id.tochka:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText(".");
                } else {
                    tvResult.append(".");
                }
        }
        isClickOperation = false;
    }

    public void onClickOperation(View view) {
        switch (view.getId()) {
            case R.id.plus:
                firstVal = Double.parseDouble(tvResult.getText().toString());
                operation = "+";
                isClickOperation = true;
                break;
            case R.id.minus:
                firstVal = Double.parseDouble(tvResult.getText().toString());
                operation = "-";
                isClickOperation = true;
                break;
            case R.id.multiply:
                firstVal = Double.parseDouble(tvResult.getText().toString());
                operation = "*";
                isClickOperation = true;
                break;
            case R.id.divide:
                firstVal = Double.parseDouble(tvResult.getText().toString());
                operation = "/";
                isClickOperation = true;
                break;
            case R.id.clean:
                tvResult.setText("0");
                break;


            case R.id.equals:
                secondVal = Double.parseDouble(tvResult.getText().toString());
                Number res = 0;

                switch (operation) {
                    case "+":
                        res = firstVal + secondVal;
                        break;
                    case "*":
                        res = firstVal * secondVal;
                        break;
                    case "/":
                        res = firstVal / secondVal;
                        break;
                    case "-":
                        res = firstVal - secondVal;
                        break;
                }
                tvResult.setText(res.toString());
                //tvResult.setText(new DecimalFormat "##.######").format(res);
                isClickOperation = true;
                break;

        }

    }
    public void onPut2Activity(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String text = tvResult.getText().toString();
        intent.putExtra("key1",text);
        startActivity(intent);

    }

}
