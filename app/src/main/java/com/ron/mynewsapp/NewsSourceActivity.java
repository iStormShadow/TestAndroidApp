package com.ron.mynewsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.widget.Toast;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.ron.mynewsapp.Services.NewsApiService;
import com.ron.mynewsapp.model.JiraResponse;
import com.ron.mynewsapp.model.NewsResponse;
import com.ron.mynewsapp.model.NewsSourceResponse;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsSourceActivity extends AppCompatActivity {

    RecyclerView newSourceList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_source);
        /*Call<JiraResponse> responseCallJira = NewsApiService.getJiraResponse().getJiraResponse();
        responseCallJira.enqueue(new Callback<JiraResponse>() {
            @Override
            public void onResponse(Call<JiraResponse> call, Response<JiraResponse> response) {
                System.out.println("response = " + response.body());
            }

            @Override
            public void onFailure(Call<JiraResponse> call, Throwable t) {
                System.out.println("Failure = ");
            }
        });*/


        Call<NewsSourceResponse> responseCall = NewsApiService.getNewsSources().getSources();
        responseCall.enqueue(new Callback<NewsSourceResponse>() {
            @Override
            public void onResponse(Call<NewsSourceResponse> call, Response<NewsSourceResponse> response) {
                loadNewsSources(response.body());
            }

            @Override
            public void onFailure(Call<NewsSourceResponse> call, Throwable t) {
                Toast.makeText(NewsSourceActivity.this, "Could not fetch sources", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void loadNewsSources(NewsSourceResponse newsSources) {
        newSourceList = (RecyclerView) findViewById(R.id.activity_news_sourcelist);
        NewsSourceAdapter newsSourceAdapter = new NewsSourceAdapter(newsSources);
        newSourceList.setLayoutManager(new LinearLayoutManager(this));
        newSourceList.setAdapter(newsSourceAdapter);
    }
}
