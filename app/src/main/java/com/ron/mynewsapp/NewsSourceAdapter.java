package com.ron.mynewsapp;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ron.mynewsapp.model.NewsSourceResponse;
import com.ron.mynewsapp.model.Source;
import com.ron.mynewsapp.model.UrlsToLogos;
import com.squareup.picasso.Picasso;


public class NewsSourceAdapter extends RecyclerView.Adapter<NewsSourceAdapter.NewsSourceViewHolder>{

    NewsSourceResponse newsSources;

    public NewsSourceAdapter(NewsSourceResponse newsSources) {
        this.newsSources=newsSources;
    }

    @Override
    public NewsSourceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_sourceitem,parent,false);
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
