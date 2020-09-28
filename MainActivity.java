package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText bil1, bil2, operasi;
    TextView hasil;
    Button Tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bil1 = findViewById(R.id.editAngka1);
        bil2 = findViewById(R.id.editAngka2);
        operasi = findViewById(R.id.operator);
        hasil = findViewById(R.id.textHasil);
        Tombol = findViewById(R.id.tombol);
    }

    public void Hitung(View view){
        double ichi = Double.parseDouble(bil1.getText().toString());
        double ni = Double.parseDouble(bil2.getText().toString());

        if ("+".equals(operasi.getText().toString())) {
            double total = ichi + ni;
            hasil.setText(String.valueOf(total));
        }
        else if ("-".equals(operasi.getText().toString())) {
            double total = ichi - ni;
            hasil.setText(String.valueOf(total));
        }
        else if ("*".equals(operasi.getText().toString())) {
            double total = ichi * ni;
            hasil.setText(String.valueOf(total));
        }
        else if ("/".equals(operasi.getText().toString())) {
            double total = ichi / ni;
            hasil.setText(String.valueOf(total));
        }
        else{
            hasil.setText("OPERASI ARITMATIKA TIDAK SESUAI");
        }
    }
}