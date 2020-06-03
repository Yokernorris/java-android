package com.example.recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/* Dentro de la carpeta res esta organizado todos los recursos del proyecto, en este ejemplo insertamos un icono
en el centro de la pantalla, para ello lo metemos dentro de la carpeta res/drawable.

Como podemos apreciar en el mainactivity dentro del metodo onCreate hace tambien referencia a este icono, R es una clase
oculta con las direcciones de memoria de cada recurso compartido
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
