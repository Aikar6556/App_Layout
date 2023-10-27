package com.cifpceuta.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        array.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(view.getContext(),array.getAdapter().getItem(i).toString(),Toast.LENGTH_LONG).show();
            }
        });



    }

    public void inicio (View view){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
}