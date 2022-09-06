package com.example.calculator_relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input1;
    EditText input2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        result = (TextView) findViewById(R.id.result);
    }

    public void Plus(View v){
        double num1 = 0;
        double num2 = 0;
        try {
            num1 = Double.parseDouble(input1.getText().toString());
        }
        catch (NumberFormatException e) {

        }
        try {
            num2 = Double.parseDouble(input2.getText().toString().trim());
        }
        catch (NumberFormatException e) {

        }

        double result_num = num1 + num2;
        result.setText(String.valueOf(result_num));

    }

    public void Minus(View v){
        double num1 = 0;
        double num2 = 0;
        try {
            num1 = Double.parseDouble(input1.getText().toString().trim());
        }
        catch (NumberFormatException e) {

        }
        try {
            num2 = Double.parseDouble(input2.getText().toString().trim());
        }
        catch (NumberFormatException e) {

        }

        double result_num = num1 - num2;
        result.setText(String.valueOf(result_num));

    }

    public void Multiple(View v){
        double num1 = 0;
        double num2 = 0;
        try {
            num1 = Double.parseDouble(input1.getText().toString().trim());
        }
        catch (NumberFormatException e) {

        }
        try {
            num2 = Double.parseDouble(input2.getText().toString().trim());
        }
        catch (NumberFormatException e) {

        }

        double result_num = num1 * num2;
        result.setText(String.valueOf(result_num));
    }

    public void Divide(View v){
        double num1 = 0;
        double num2 = 0;
        try {
            num1 = Double.parseDouble(input1.getText().toString().trim());
        }
        catch (NumberFormatException e){

        }
        try {
            num2 = Double.parseDouble(input2.getText().toString().trim());
        }
        catch (NumberFormatException e) {

        }

        double result_num = num1 / num2;
        result.setText(String.valueOf(result_num));
    }
}