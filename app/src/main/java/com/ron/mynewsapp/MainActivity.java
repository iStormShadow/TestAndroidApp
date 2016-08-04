package com.ron.mynewsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView newList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newList = (RecyclerView) findViewById(R.id.activity_main_newslist);
        NewsAdapter newsAdapter = new NewsAdapter();
        newList.setLayoutManager(new LinearLayoutManager(this));
        newList.setAdapter(newsAdapter);

    }

}
