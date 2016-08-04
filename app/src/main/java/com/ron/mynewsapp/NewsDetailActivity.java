package com.ron.mynewsapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class NewsDetailActivity extends AppCompatActivity {

    private static final String DETAILS_URL = "detailsUrl";
    private WebView detailWebView;
    private ProgressBar loading;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_detail);
        loadDetails();
    }

    public static void start(Context ctx, String url) {
        Intent i = new Intent(ctx,NewsDetailActivity.class);
        i.putExtra("detailsUrl",url);
        ctx.startActivity(i);
    }

    public void loadDetails(){
        detailWebView = (WebView) findViewById(R.id.details_webview);
        loading = (ProgressBar) findViewById(R.id.details_progress);
        Bundle extras = getIntent().getExtras();
        detailWebView.getSettings().setJavaScriptEnabled(true);
        detailWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                loading.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                loading.setVisibility(View.INVISIBLE);
            }
        });
        detailWebView.loadUrl(extras.getString(DETAILS_URL));
    }

}
