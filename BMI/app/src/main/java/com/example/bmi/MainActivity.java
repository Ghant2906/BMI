package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnTinh;
    String kluong, chieuCao;
    float ketQua;
    EditText editTextKL, editTextCC;
    TextView tvKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTinh = (Button) findViewById(R.id.button);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    editTextKL = (EditText) findViewById(R.id.editTextKL);
                    editTextCC = (EditText) findViewById(R.id.editTextCC);
                    kluong = editTextKL.getText().toString();
                    chieuCao = editTextCC.getText().toString();
                    ketQua = Float.parseFloat(kluong) /(Float.parseFloat(chieuCao)*Float.parseFloat(chieuCao));
                    tvKQ = (TextView) findViewById(R.id.textViewKQ);
                    tvKQ.setText(Float.toString(ketQua));
                }
                catch (Exception e){

                }
            }
        });
    }
}