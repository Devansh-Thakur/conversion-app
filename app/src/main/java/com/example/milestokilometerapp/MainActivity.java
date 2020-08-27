package com.example.milestokilometerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button convert = (Button) findViewById(R.id.button);
    }
    public void ConvertIt(View view){
        EditText miles = (EditText)findViewById(R.id.miles), kilometers = (EditText)findViewById(R.id.kilometers);
        TextView Converted_miles = (TextView)findViewById(R.id.show_miles),Converted_kilometers = (TextView)findViewById(R.id.show_kilometers);
        int kilo,mil;
        kilo = Integer.parseInt(kilometers.getText().toString());
        mil = Integer.parseInt(miles.getText().toString());
        float convkilo = (float) (kilo*1.60934);
        float convmile = (float) (mil*0.621371);
        Converted_kilometers.setText("converted kilometeres:    " + convkilo);
        Converted_miles.setText("Converted miles    " + convmile);
    }
}
