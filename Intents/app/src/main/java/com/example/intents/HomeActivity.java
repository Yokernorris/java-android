package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lista;
    List<String> androidVersionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle extras = getIntent().getExtras();
        String email = extras.getString("valorEmail");

        setTitle(email);

        // 1 conectamos lista con el componente visual
        lista = findViewById(R.id.listView);

        // 2 Cargamos elementos
        androidVersionList = new ArrayList<>();
        androidVersionList.add("Pie");
        androidVersionList.add("Oreo");
        androidVersionList.add("Nougat");
        androidVersionList.add("Marshmallow");
        androidVersionList.add("Lollipop");
        androidVersionList.add("Kikat");
        androidVersionList.add("...");

        // 3 Adaptador
        ArrayAdapter adaptadorVersiones = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                androidVersionList
        );

        // 4 Vinculacion listView
        lista.setAdapter(adaptadorVersiones);

        // 5 Gestion de evento click
        lista.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String androirVersion =  androidVersionList.get(position);
        Log.i("APP", "Version Click: " + androirVersion);
    }
}
