package com.ron.mynewsapp;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ron.mynewsapp.model.NewsItem;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder>{

    List<NewsItem> newsItemList = new NewsItem().getNewsItemList();

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item,parent,false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        if (null == newsItemList)
            return;
        final NewsItem newsItem = newsItemList.get(position);
        holder.title.setText(newsItem.getTitle());
        holder.author.setText(newsItem.getAuthor());
        holder.description.setText(newsItem.getDescription());
        holder.newsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewsDetailActivity.start(view.getContext(),newsItem.getDetailsUrl());
            }
        });
        Picasso.with(holder.image.getContext()).load(newsItem.getImageUrl()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        if (null == newsItemList)
            return 0;
        return newsItemList.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title;
        TextView author;
        TextView description;
        CardView newsCardView;

        public NewsViewHolder (View view) {
            super(view);
            image = (ImageView) view.findViewById(R.id.item_img);
            title = (TextView) view.findViewById(R.id.item_title);
            author = (TextView) view.findViewById(R.id.item_author);
            description = (TextView) view.findViewById(R.id.item_description);
            newsCardView = (CardView) view.findViewById(R.id.news_cardview);
        }
    }

}
