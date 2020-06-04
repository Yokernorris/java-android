package com.example.eventoclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creamos una variable button para rescatar el valor
        Button btn1 = findViewById(R.id.button_test1);
        btn1.setOnClickListener(view ->
                Toast.makeText(this,"Click en el button 1",Toast.LENGTH_SHORT).show());

        TextView tv2 = findViewById(R.id.textView2);
        tv2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Click en el texto 2",Toast.LENGTH_SHORT).show();

    }
}
