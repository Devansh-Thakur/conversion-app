package com.example.milestokilometerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText enterValue;
    TextView result;
    Button convertToKM, convertToMiles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        convertToKM = findViewById(R.id.button_to_KM);
        convertToMiles = findViewById(R.id.button_to_miles);
        enterValue = findViewById(R.id.edittext_value);

        convertToKM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = enterValue.getText().toString().trim();
                if (!value.equals("")) {
                    float miles = Float.parseFloat(value);
                    float km = (float) (miles * 1.609);
                    result.setText(String.valueOf(km + " Km"));
                } else
                    Toast.makeText(MainActivity.this, "This can't be empty", Toast.LENGTH_SHORT).show();
            }
        });

        convertToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = enterValue.getText().toString().trim();
                if (!value.equals("")) {
                    float km = Float.parseFloat(value);
                    float miles = (float) (km * 0.6213);
                    result.setText(String.valueOf(miles + " Miles"));
                } else
                    Toast.makeText(MainActivity.this, "This can't be empty", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
