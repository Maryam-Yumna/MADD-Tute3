package com.example.intentsproj;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        String num1 = getIntent().getExtras().getString("Number1");
        String num2 = getIntent().getExtras().getString("Number2");

        EditText editTextNum1 = (EditText) findViewById(R.id.editTextNumber1);
        EditText editTextNum2 = (EditText) findViewById(R.id.editTextNumber2);

        editTextNum1.setText(num1);
        editTextNum2.setText(num2);

        final int number1 = Integer.parseInt(num1);
        final int number2 = Integer.parseInt(num2);

        //double result;

        Button btnAdd = (Button)findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {


                int result = number1 + number2;
                TextView tvResult = (TextView) findViewById(R.id.resultTextView);
                tvResult.setText(number1 +" + "+number2+" = "+result);

            }
        });

        Button btnSubstract = (Button)findViewById(R.id.btnSubstract);
        btnSubstract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {


                int result = number1 - number2;
                TextView tvResult = (TextView) findViewById(R.id.resultTextView);
                tvResult.setText(number1 +" - "+number2+" = "+result);

            }
        });

        Button btnMultiply = (Button)findViewById(R.id.btnMultiply);
        btnMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {


                int result = number1 * number2;
                TextView tvResult = (TextView) findViewById(R.id.resultTextView);
                tvResult.setText(number1 +" * "+number2+" = "+result);

            }
        });

        Button btnDivide = (Button)findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                double result = (double)number1 / number2;
                TextView tvResult = (TextView) findViewById(R.id.resultTextView);
                tvResult.setText(number1 +" * "+number2+" = "+result);

            }
        });



    }



}