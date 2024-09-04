package com.example.myapplication;


import static com.example.myapplication.R.layout.activity_interactive;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Interactive extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_interactive);

        final LinearLayout layout;
        layout = findViewById(R.id.DarkLayout);
        Button darkbutton = findViewById(R.id.btnDark);


        darkbutton.setOnClickListener(v -> {

            if (darkbutton.getText().toString().equals("Dark")) {
                layout.setBackgroundColor(Color.BLACK);
                darkbutton.setText(R.string.Light);
                darkbutton.setBackgroundColor(Color.WHITE);
                darkbutton.setTextColor(Color.BLACK);
            } else {
                layout.setBackgroundColor(Color.WHITE);
                darkbutton.setText(R.string.Dark);
                darkbutton.setBackgroundColor(Color.BLACK);
                darkbutton.setTextColor(Color.WHITE);
            }

            Toast.makeText(getApplicationContext(), darkbutton.getText() + " Theme Applied", Toast.LENGTH_SHORT).show();
        });





    }
}
