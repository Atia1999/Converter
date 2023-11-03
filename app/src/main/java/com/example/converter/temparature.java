package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class temparature extends AppCompatActivity {
    Button btnCalculate,btnClear;
    EditText edtAmount;
    RadioButton CtoF,FtoC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temparature);
        btnCalculate=findViewById(R.id.btnCalculate);
        btnClear=findViewById(R.id.btnClear);
        edtAmount=findViewById(R.id.edTxt);
        CtoF=findViewById(R.id.C_to_F);
        FtoC=findViewById(R.id.F_to_C);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view){
            Double input = new Double(edtAmount.getText().toString());
            if (CtoF.isChecked()) {
                double result = convert_temp.C2toF(input);
                edtAmount.setText(new Double(result).toString());
            } else if (FtoC.isChecked()) {
                double result = convert_temp.F2toC(input);
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