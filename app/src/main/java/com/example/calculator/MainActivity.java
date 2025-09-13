package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Add(View v){
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber3);

        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());
        double result = n1 + n2;

        if (result == (int) result) {
            et3.setText("Hasil Pertambahanya " + (int) result);
        } else {
            et3.setText("Hasil Pertambahanya " + result);
        }
    }

    public void Subtract(View v){
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber3);

        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());
        double result = n1 - n2;

        if (result == (int) result) {
            et3.setText("Hasil Penguranganya " + (int) result);
        } else {
            et3.setText("Hasil Penguranganya " + result);
        }
    }

    public void Multiply(View v){
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber3);

        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());
        double result = n1 * n2;

        if (result == (int) result) {
            et3.setText("Hasil Perkalianya " + (int) result);
        } else {
            et3.setText("Hasil Perkalianya " + result);
        }
    }

    public void Divide(View v){
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber3);

        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());
        double result = n1 / n2;

        et3.setText("Hasil Pembagianya " + result);
        if (result == (int) result) {
            et3.setText("Hasil Pembagianya " + (int) result);
        } else {
            et3.setText("Hasil Pembagianya " + result);
        }
    }
}