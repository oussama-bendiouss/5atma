package com.outil.a5atma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Compteur extends AppCompatActivity {
    TextView T;
    float   nombre = 0;
   float nb_hezb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compteur);
        getSupportActionBar().hide();
        T = findViewById(R.id.centre);
        T.setText("0 حزب");


    }

    public void incre_decre(View view) {

        float l = Float.valueOf( view.getTag().toString());
        if (nombre + l < 60 && nombre + l>=0){
            nombre = nombre + l;
            nb_hezb = nombre;
            T.setText( nombre + "حزب\n");
        }else if(nombre + l == 60){
            T.setText("0 حزب");
            nombre = 0;
            Toast.makeText(this,"Félicitation tu as terminé une 5atma",Toast.LENGTH_LONG).show();
            Intent go = new Intent();
            go.setClass(Compteur.this, Finir_Coran.class);
            startActivity(go );
        }

        Log.i(String.valueOf(nombre) , "emldm");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Intent ms = getIntent();
        String tag = ms.getStringExtra("tag");
        Log.i("tag", tag);
        SharedPreferences prefs = getSharedPreferences(tag,MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putFloat("nombre_hizb",nombre);
        editor.apply();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Intent ms = getIntent();
        String tag = ms.getStringExtra("tag");
        SharedPreferences prefs = getSharedPreferences(tag,MODE_PRIVATE);
        nombre = prefs.getFloat("nombre_hizb",nombre);
        Log.i("numbre arrive", tag);
        if (nombre  < 60){
            nombre = nombre ;
            nb_hezb = nombre;
            T.setText( nombre + "حزب\n");
        }else if(nombre == 60){
            T.setText("0 حزب");
            Toast.makeText(this,"Félicitation tu as terminé une 5atma",Toast.LENGTH_LONG).show();
        }

}
}