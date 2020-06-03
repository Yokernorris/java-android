package com.example.constrainlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clikOnRecordar(View view) {
        //Para diferenciar usaremos el identificador
        CheckBox check = (CheckBox) view;

        switch (view.getId()){
            case R.id.recordar:
                if (check.isChecked())
                    Toast.makeText(this,"Se ha hecho click en recordar",Toast.LENGTH_LONG).show();
                break;
            case R.id.inicio:
                if (check.isChecked())
                    Toast.makeText(this,"Se ha hecho click en inicio",Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }
}
