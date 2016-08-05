package com.ron.mynewsapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class NewsDetailActivity extends AppCompatActivity {

    private static final String DETAILS_URL = "detailsUrl";
    private static final String TITLE = "title";
    private WebView detailWebView;
    private ProgressBar loading;
    Bundle extras;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_detail);
        extras = getIntent().getExtras();
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(extras.getString(TITLE));
        loadDetails();
    }

    public static void start(Context ctx, String url, String title) {
        Intent i = new Intent(ctx,NewsDetailActivity.class);
        i.putExtra("detailsUrl",url);
        i.putExtra("title", title);
        ctx.startActivity(i);
    }

    public void loadDetails(){

        detailWebView = (WebView) findViewById(R.id.details_webview);
        loading = (ProgressBar) findViewById(R.id.details_progress);
        detailWebView.getSettings().setJavaScriptEnabled(true);
        detailWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                loading.setVisibility(view.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                loading.setVisibility(view.GONE);
            }
        });
        detailWebView.loadUrl(extras.getString(DETAILS_URL));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
