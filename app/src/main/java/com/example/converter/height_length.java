package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class height_length extends AppCompatActivity {
    Button btnCalculate,btnClear;
    EditText edtAmount;
    RadioButton MtoI,ItoM;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height_length);

        btnCalculate=findViewById(R.id.btnCalculate);
        btnClear=findViewById(R.id.btnClear);
        edtAmount=findViewById(R.id.edTxt);
        MtoI=findViewById(R.id.MtoIn);
        ItoM=findViewById(R.id.IntoM);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Double input = new Double(edtAmount.getText().toString());
                if (MtoI.isChecked()) {
                    double result = convert_temp.M2toI(input);
                    edtAmount.setText(new Double(result).toString());
                } else if (ItoM.isChecked()) {
                    double result = convert_temp.I2roM(input);
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