package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Currency extends AppCompatActivity {
    Button btnCalculate,btnClear;
    EditText edtAmount;
    RadioButton rdUSDtoBDT,rdBDTtoUSD,rdINRtoUSD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        btnCalculate=findViewById(R.id.btnCalculate);
        btnClear=findViewById(R.id.btnClear);
        edtAmount=findViewById(R.id.edTxt);
        rdUSDtoBDT=findViewById(R.id.rdUSDtoBDT);
        rdBDTtoUSD=findViewById(R.id.rdBDTtoUSD);
        rdINRtoUSD=findViewById(R.id.rdINRtoUSD);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double input=new Double(edtAmount.getText().toString());
                if(rdUSDtoBDT.isChecked()){
                    double result=convert_temp.usdBDT(input);
                    edtAmount.setText(new Double(result).toString());
                }
                else  if(rdBDTtoUSD.isChecked()){
                    double result=convert_temp.bdtUSD(input);
                    edtAmount.setText(new Double(result).toString());
                }
                else  if(rdINRtoUSD.isChecked()){
                    double result=convert_temp.inrUSD(input);
                    edtAmount.setText(new Double(result).toString());
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtAmount.setText("");
            }
        });
    }
}