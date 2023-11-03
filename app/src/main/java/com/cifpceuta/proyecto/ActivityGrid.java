package com.cifpceuta.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityGrid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
    }

    public void volver (View view){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void btnChat (View view){

        Intent i = new Intent(this, ActivityConstraint.class);
        startActivity(i);
    }


}