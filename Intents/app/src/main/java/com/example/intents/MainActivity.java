package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1;
    EditText textEmail;
    EditText textPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button_login);
        btn1.setOnClickListener(this);
        textEmail = findViewById(R.id.textEmail);
        textPwd = findViewById(R.id.textPwd);
    }


    @Override
    public void onClick(View v) {
        Log.i("APP", "Click en login");
        String email = textEmail.getText().toString();
        String pwd = textPwd.getText().toString();

        if(!email.isEmpty() && !pwd.isEmpty()) {
            Intent intentLogin = new Intent(this, HomeActivity.class);
            intentLogin.putExtra("valorEmail",email);
            startActivity(intentLogin);
        }

    }
}
