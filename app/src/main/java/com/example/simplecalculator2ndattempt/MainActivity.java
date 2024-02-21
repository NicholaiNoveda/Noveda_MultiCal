package com.example.simplecalculator2ndattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Num1;
    EditText Num2;
    Button Addition;
    Button Subtractions;
    Button Multiplication;
    Button Division;
    TextView Result;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = findViewById(R.id.txtNum1);
        Num2 = findViewById(R.id.txtNum2);
        Addition = findViewById(R.id.btnAdd);
        Subtractions = findViewById(R.id.btnSub);
        Multiplication = findViewById(R.id.btnMul);
        Division = findViewById(R.id.btnDiv);
        Result = findViewById(R.id.txtResult);


        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double myNum1 = Double.parseDouble(Num1.getText().toString());
                double myNum2 = Double.parseDouble(Num2.getText().toString());
                double results = myNum1 + myNum2;

                Result.setText(String.valueOf(results));

            }
        });
       Subtractions.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               double myNum1 = Double.parseDouble(Num1.getText().toString());
               double myNum2 = Double.parseDouble(Num2.getText().toString());
               double results = myNum1 - myNum2;
               Result.setText(String.valueOf(results));

           }
       });
       Multiplication.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               double myNum1 = Double.parseDouble(Num1.getText().toString());
               double myNum2 = Double.parseDouble(Num2.getText().toString());
               double results = myNum1 * myNum2;
               Result.setText(String.valueOf(results));
           }
       });
       Division.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               double myNum1 = Double.parseDouble(Num1.getText().toString());
               double myNum2 = Double.parseDouble(Num2.getText().toString());
               double results = myNum1 / myNum2;

               Result.setText(String.valueOf(results));

           }
       });
    }
}