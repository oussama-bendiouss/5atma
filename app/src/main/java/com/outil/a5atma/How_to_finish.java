package com.outil.a5atma;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class How_to_finish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_finish);
    }

    public void how_many(View view) {
        String tag = view.getTag().toString();

        AlertDialog.Builder builder = new AlertDialog.Builder(How_to_finish.this);
        builder.setMessage(tag)
                .setCancelable(true)
                .setTitle(tag)
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    /**
                     * This method will be invoked when a button in the dialog is clicked.
                     *
                     * @param dialog the dialog that received the click
                     * @param which  the button that was clicked (ex.
                     *               {@link DialogInterface#BUTTON_POSITIVE}) or the position
                     */
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

     AlertDialog dialog = builder.create();
        dialog.show();
    }
}