package com.example.exp10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String str = i.getStringExtra("web");
        web = findViewById(R.id.web);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl(str);
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
}