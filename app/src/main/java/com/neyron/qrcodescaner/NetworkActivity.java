package com.neyron.qrcodescaner;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.webkit.WebView;
import android.support.v7.app.AppCompatActivity;

public class NetworkActivity extends AppCompatActivity  {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        String adress = getIntent().getExtras().getString("qrdecode");
        getSupportActionBar().setTitle(adress);
        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new webClientMy());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.google.ru/search?q="+adress+"&ie=UTF-8&oe=UTF-8");
    }
    @Override
    public void onBackPressed() {
        finish();
        if(webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}

