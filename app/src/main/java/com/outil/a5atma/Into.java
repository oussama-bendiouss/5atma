package com.outil.a5atma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Into extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_into);
        getSupportActionBar().hide();
        final Intent  i = new Intent(Into.this, MainActivity.class);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                startActivity(i);
                finish();
            }
        },2000);
    }
}