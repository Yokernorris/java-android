package com.example.queesunactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    /* onCreate es el metodo principal del activity, es lanzado automaticamente para crear la pantalla principal
    Dentro de la carpeta manifest se puede ver la asignacion del mainActivity

    Por cada activity se crea una nueva ventana, aunque no es la unica forma de navegar por la interface

    Para crear un nuevo activity new-activity
     */

    /* Ciclo de vida, el ciclo de vida comienza cuando el activty es lanzado, vamos a hacer que nuestra app imprima todos
    los estados en los que se encuentra
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("LOGCICLO","Entramos en el metodo onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LOGCICLO","Entramos en el metodo onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LOGCICLO","Entramos en el metodo onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LOGCICLO","Entramos en el metodo onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LOGCICLO","Entramos en el metodo onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LOGCICLO","Entramos en el metodo onDestroy");
    }
}
