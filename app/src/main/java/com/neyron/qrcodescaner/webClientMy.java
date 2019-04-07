package com.neyron.qrcodescaner;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webClientMy extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
