package com.radanov.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


     Button ok;
     TextView result;
     ImageView image;
     Spinner spinner;
     ArrayAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ok = findViewById(R.id.buttonOk);
        result = findViewById(R.id.textViewResult);
        image = findViewById(R.id.imageExample);
        spinner = findViewById(R.id.spinnerCountry);

        adapter = ArrayAdapter.createFromResource(this,R.array.countries, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              String country = parent.getItemAtPosition(position).toString();
              result.setText(country);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }

}