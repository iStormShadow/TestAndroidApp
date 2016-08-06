package com.ron.mynewsapp;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.ron.mynewsapp.model.NewsSourceResponse;
import com.ron.mynewsapp.model.Source;
import com.ron.mynewsapp.model.UrlsToLogos;
import com.squareup.picasso.Picasso;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;


public class NewsSourceAdapter extends RecyclerView.Adapter<NewsSourceAdapter.NewsSourceViewHolder>{

    NewsSourceResponse newsSources;
    Context ctx;

    public NewsSourceAdapter(NewsSourceResponse newsSources) {
        this.newsSources=newsSources;
    }

    @Override
    public NewsSourceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_sourceitem,parent,false);
        ctx = view.getContext();
        return new NewsSourceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsSourceViewHolder holder, int position) {
        if (null == newsSources)
            return;
        final Source newsSourceItem = newsSources.getSources().get(position);
        UrlsToLogos logoUrl = newsSources.getSources().get(position).getUrlsToLogos();
        holder.title.setText(newsSourceItem.getName());
        holder.description.setText(newsSourceItem.getDescription());
        holder.newsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.start(view.getContext(),newsSourceItem.getId(),newsSourceItem.getName());
            }
        });
        /*OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request newRequest = chain.request().newBuilder()
                        .addHeader("Authorization", "Basic cmF1bmFrLm5hdGh3YW5pQHZvZGFmb25lLmNvbToxNElkb250a25vdw==")
                        .build();
                return chain.proceed(newRequest);
            }
        }).build();

        Picasso picasso = new Picasso.Builder(ctx)
                .downloader(new OkHttp3Downloader(client))
                .build();
        picasso.load("https://jira.sp.vodafone.com/secure/projectavatar?pid=15776&avatarId=10011").into(holder.image);*/
        Picasso.with(holder.image.getContext()).load(logoUrl.getSmall()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        if (null == newsSources)
            return 0;
        return newsSources.getSources().size();
    }

    public class NewsSourceViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title;
        TextView description;
        CardView newsCardView;

        public NewsSourceViewHolder(View view) {
            super(view);
            image = (ImageView) view.findViewById(R.id.source_item_img);
            title = (TextView) view.findViewById(R.id.source_item_title);
            description = (TextView) view.findViewById(R.id.source_item_description);
            newsCardView = (CardView) view.findViewById(R.id.news_source_cardview);
        }
    }

}
