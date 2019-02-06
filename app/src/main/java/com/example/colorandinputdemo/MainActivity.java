package com.example.colorandinputdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Grab text from EditText and puts it in output
     * @param view Button passed into function
     *
     */
    public void Submit(View view) {
        EditText input = findViewById(R.id.input);
        TextView output = findViewById(R.id.output);
        String inputText = input.getText().toString();
        output.setText(inputText);

        int red = (int) (Math.pow(2, 8) * Math.random());
        int green = (int) (Math.pow(2, 8) * Math.random());
        int blue = (int) (Math.pow(2, 8) * Math.random());
        output.setBackgroundColor(Color.rgb(red, green, blue));

    }
}
