package com.cifpceuta.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityRelative extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        ListView array;

        array = (ListView) findViewById(R.id.lista);


        String[] listItem;

        listItem=getResources().getStringArray(R.array.array_modulos);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,listItem);
        array.setAdapter(adapter);
    }
}