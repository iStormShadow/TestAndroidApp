package com.ron.mynewsapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.ron.mynewsapp.Services.NewsApiService;
import com.ron.mynewsapp.model.NewsResponse;
import com.ron.mynewsapp.model.Source;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by admin on 8/6/2016.
 */

public class NewsFragment extends Fragment {

    public static final String SOURCE_ID = "sourceId";
    public static final String SOURCE_NAME = "sourceName";
    RecyclerView recyclerView;
    String sourceId;
    String sourceName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sourceId=getArguments().getString(SOURCE_ID);
        sourceName=getArguments().getString(SOURCE_NAME);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.activity_main, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = (RecyclerView) view.findViewById(R.id.activity_main_newslist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        Call<NewsResponse> responseCall = NewsApiService.getNewsApiResponse().getArticles(sourceId);
        responseCall.enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                NewsResponse newsApiArticleResponse = response.body();
                NewsAdapter newsAdapter = new NewsAdapter(newsApiArticleResponse);
                recyclerView.setAdapter(newsAdapter);
            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {

            }
        });

    }

    public static NewsFragment generateFragment(Source sources) {
        NewsFragment listOfArticlesFragment = new NewsFragment();
        Bundle bundle = new Bundle();
        bundle.putString(SOURCE_ID, sources.getId());
        bundle.putString(SOURCE_NAME, sources.getName());
        listOfArticlesFragment.setArguments(bundle);
        return listOfArticlesFragment;
    }

}
