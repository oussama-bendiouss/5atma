package com.outil.a5atma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Principale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principale);
    }

    public void gotoactivity(View view) {
        String tag = view.getTag().toString();
        switch (tag){
            case "1":
                Intent goone = new Intent();
                goone.setClass(Principale.this,MainActivity.class);
                startActivity(goone);
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":

                Intent gofive = new Intent();
                gofive.setClass(Principale.this,Youtube.class);
                startActivity(gofive);
                break;
        }
    }
}