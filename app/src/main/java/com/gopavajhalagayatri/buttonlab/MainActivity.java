package com.gopavajhalagayatri.buttonlab;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button submitButton;
    Button colorButton;
    EditText responseText;
    TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton=findViewById(R.id.clickButton);
        colorButton=findViewById(R.id.clickButton2);
        responseText=findViewById(R.id.responseEditText);
        displayText=findViewById(R.id.textBox);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hi!!!");
                Log.d("testButton","input is: "+responseText.getText());
                displayText.setText(responseText.getText());
            }
        });
        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("colorButton","here");
                colorButton.setBackgroundColor(Color.rgb(204, 255, 153));
            }
        });
    }
}
