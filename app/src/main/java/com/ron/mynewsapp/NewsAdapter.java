package com.ron.mynewsapp;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ron.mynewsapp.model.Article;
import com.ron.mynewsapp.model.NewsItem;
import com.ron.mynewsapp.model.NewsResponse;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder>{

    NewsResponse articleList;

    public NewsAdapter(NewsResponse articleList) {
        this.articleList=articleList;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item,parent,false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        if (null == articleList)
            return;
        final Article newsItem = articleList.getArticles().get(position);
        holder.title.setText(newsItem.getTitle());
        holder.author.setText("By " + newsItem.getAuthor());
        holder.description.setText(newsItem.getDescription());
        holder.newsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewsDetailActivity.start(view.getContext(),newsItem.getUrl(),newsItem.getTitle());
            }
        });
        Picasso.with(holder.image.getContext()).load(newsItem.getUrlToImage()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        if (null == articleList)
            return 0;
        return articleList.getArticles().size();
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
