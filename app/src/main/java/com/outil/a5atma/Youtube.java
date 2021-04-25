package com.outil.a5atma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static android.app.PendingIntent.getActivity;

public class Youtube extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = new WebView(this);
        setContentView(webView);
        WebSettings websettings = webView.getSettings();
        websettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());
        String url = "https://www.youtube.com/user/QuranMaroc";
        webView.loadUrl(url);
    }

}