package com.outil.a5atma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer nb5atma =0;
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        tx = findViewById(R.id.nb5atma);
        Intent l = getIntent();
        nb5atma+= l.getIntExtra("nombre_de_5atma",0);
        tx.setText("ختمت القرآن الكريم "+nb5atma+" مرة ");

    }

    public void number_of_5atma(View view) {
        String tag = (String) view.getTag().toString();
        Log.i("nuberofmsg",tag);
        Intent l = new Intent();
        l.setClass(MainActivity.this,Compteur.class);
        l.putExtra("tag",tag);
        startActivity(l);

        
    }
}