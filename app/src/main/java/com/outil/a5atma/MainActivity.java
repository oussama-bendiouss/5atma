package com.outil.a5atma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
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