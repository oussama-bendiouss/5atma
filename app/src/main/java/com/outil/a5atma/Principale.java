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
                Intent goOne = new Intent();
                goOne.setClass(Principale.this,MainActivity.class);
                startActivity(goOne);
                break;
            case "2":
                Intent goTwo = new Intent();
                goTwo.setClass(Principale.this,How_to_finish.class);
                startActivity(goTwo);
                break;
            case "3":
                Intent goThree = new Intent();
                goThree.setClass(Principale.this,Saba7.class);
                startActivity(goThree);
                break;
            case "4":
                Intent goFour = new Intent();
                goFour.setClass(Principale.this,Masa2.class);
                startActivity(goFour);
                break;
            case "5":
                Intent goFive= new Intent();
                goFive.setClass(Principale.this,Youtube.class);
                startActivity(goFive);
                break;
            case "6":
                Intent goSix = new Intent();
                goSix.setClass(Principale.this,Coran.class);
                startActivity(goSix);
        }
    }
}