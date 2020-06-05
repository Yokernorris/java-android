package com.android.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button toast;
    Button snack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast = findViewById(R.id.buttonToast);
        snack = findViewById(R.id.buttonSnack);

        toast.setOnClickListener(this);
        snack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonToast)
            Toast.makeText(this,"Click en Toast",Toast.LENGTH_SHORT).show();
        else if (v.getId() == R.id.buttonSnack)
            Snackbar.make(v, "Mostrando SnackBar", Snackbar.LENGTH_LONG).show();

    }
}
