package com.cifpceuta.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botonLinear (View v){
        Intent i = new Intent(this, ActivityLinear.class);
        startActivity(i);
    }

    public void volver (View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void botonFrame (View v){
        Intent i = new Intent(this, Activity_frame.class);
        startActivity(i);
    }

    public void botonRelative (View v){
        Intent i = new Intent(this, ActivityRelative.class);
        startActivity(i);
    }

    public void botonTable (View v){
        Intent i = new Intent(this, TableLayout.class);
        startActivity(i);
    }

    public void botonGrid (View v){
        Intent i = new Intent(this, ActivityGrid.class);
        startActivity(i);
    }






}