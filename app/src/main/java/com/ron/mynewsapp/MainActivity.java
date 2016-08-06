package com.ron.mynewsapp;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.ron.mynewsapp.Services.NewsApiService;
import com.ron.mynewsapp.model.NewsResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView newList;
    private static final String SOURCE = "source";
    private static final String TITLE = "title";
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        extras = getIntent().getExtras();
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(extras.getString(TITLE));
        Call<NewsResponse> responseCall = NewsApiService.getNewsApiResponse().getArticles(extras.getString(SOURCE));
        responseCall.enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                loadArticles(response.body());
            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Could not fetch articles", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void loadArticles(NewsResponse response) {
        NewsAdapter newsAdapter = new NewsAdapter(response);
        newList = (RecyclerView) findViewById(R.id.activity_main_newslist);
        newList.setLayoutManager(new LinearLayoutManager(this));
        newList.setAdapter(newsAdapter);
    }

    public static void start(Context ctx, String source, String title) {
        Intent i = new Intent(ctx,MainActivity.class);
        i.putExtra(SOURCE,source);
        i.putExtra(TITLE,title);
        ctx.startActivity(i);
    }

}
