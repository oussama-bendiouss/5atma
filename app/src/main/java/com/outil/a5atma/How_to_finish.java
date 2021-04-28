package com.outil.a5atma;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class How_to_finish extends AppCompatActivity {
   String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_finish);
    }

    public void how_many(View view) {
        String tag = view.getTag().toString();

        switch(tag){
            case "1":
                msg = "لختم القرآن مرة واحدة في الشهر،يجب عليك قراءة حزب بعد صلاة الفجر و أخر بعد صلاة المغرب";
                break;
            case "2":
                msg = "لختم القرآن مرتين في الشهر، يجب عليك قراءة حزب بعد صلاة الفجر،الضهر،المغرب،العشاء. لماذا هذه الأوقات بالضبط؟ لأنكأخي المسلم في هذه الأوقات تكون غير مشغول بأمور الدنيا";
                break;
            case "3":
                msg ="لختم القرأن ثلات مرات ، يجب عليك قراءة حزب قبل صلاة الفجر و المغرب ، و حزب بعد صلاة الفجر و المغرب، بالإضافة إلى حزب بعد صلاة الضهر و العشاء";
                break;
            case "4":
                msg="لختم القرأن أربع مرات عليك بقراءة حزب بعد و قبل كل صلاة ما عد صلاة العصر";
                break;
            case "5":
                msg="لختم القرأن خمس مرات في الشهر عليك أخي المسلم بقراءة حزب قبل و  بعد كل صلاة، وبهذا تكون قرأت في اليوم الواحد عشرة أحزاب .";
                break;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(How_to_finish.this);
        builder.setMessage(msg)
                .setCancelable(true)
                .setTitle("إختم القرآن الكريم "+tag+" مرة ")
                .setNegativeButton("خروج", new DialogInterface.OnClickListener() {
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