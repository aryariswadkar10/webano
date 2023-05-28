package com.example.exp10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txt;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.txt);
        b1 = findViewById(R.id.b1);

        b1.setOnClickListener(view ->{
            String str = txt.getText().toString();
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            i.putExtra("web", str);
            startActivity(i);
        });


    }
}