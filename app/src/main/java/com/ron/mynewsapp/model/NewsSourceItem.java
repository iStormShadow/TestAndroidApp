package com.ron.mynewsapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 8/5/2016.
 */

public class NewsSourceItem {

    private String imageUrl;
    private String title;
    private String description;
    private List<NewsSourceItem> newsItemList;

    public NewsSourceItem() {
    }

    public NewsSourceItem(String imageUrl, String title, String description) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<NewsSourceItem> getNewsSourceItemList() {
        newsItemList = new ArrayList<NewsSourceItem>();
        newsItemList.add(new NewsSourceItem("http://i.newsapi.org/arstechnica-l.png",
                "Ars Technica",
                "The PC enthusiast's resource. Power users and the tools they love, without computing religion."));
        newsItemList.add(new NewsSourceItem("http://i.newsapi.org/bbcnews-l.png",
                "BBC News",
                "Use BBC News for up-to-the-minute news, breaking news, video, audio and feature stories. BBC News provides trusted World and UK news as well as local and regional perspectives. Also entertainment, business, science, technology and health news."));
        newsItemList.add(new NewsSourceItem("http://i.newsapi.org/bbcsport-l.png",
                "BBC Sport",
                "The home of BBC Sport online. Includes live sports coverage, breaking news, results, video, audio and analysis on Football, F1, Cricket, Rugby Union, Rugby League, Golf, Tennis and all the main world sports, plus major events such as the Olympic Games."));
        newsItemList.add(new NewsSourceItem("http://i.newsapi.org/arstechnica-l.png",
                "Ars Technica",
                "The PC enthusiast's resource. Power users and the tools they love, without computing religion."));
        newsItemList.add(new NewsSourceItem("http://i.newsapi.org/bbcnews-l.png",
                "BBC News",
                "Use BBC News for up-to-the-minute news, breaking news, video, audio and feature stories. BBC News provides trusted World and UK news as well as local and regional perspectives. Also entertainment, business, science, technology and health news."));
        newsItemList.add(new NewsSourceItem("http://i.newsapi.org/bbcsport-l.png",
                "BBC Sport",
                "The home of BBC Sport online. Includes live sports coverage, breaking news, results, video, audio and analysis on Football, F1, Cricket, Rugby Union, Rugby League, Golf, Tennis and all the main world sports, plus major events such as the Olympic Games."));
        return newsItemList;
    }

}
