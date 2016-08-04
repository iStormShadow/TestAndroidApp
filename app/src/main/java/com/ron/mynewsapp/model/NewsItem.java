package com.ron.mynewsapp.model;

import java.util.ArrayList;
import java.util.List;

public class NewsItem {

    private String imageUrl;
    private String title;
    private String author;
    private String description;
    private String detailsUrl;
    private List<NewsItem> newsItemList;

    public NewsItem(String imageUrl, String title, String author, String description, String detailsUrl) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.author = author;
        this.description = description;
        this.detailsUrl = detailsUrl;
    }

    public NewsItem() {
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetailsUrl() {
        return detailsUrl;
    }

    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    public List<NewsItem> getNewsItemList() {
        newsItemList = new ArrayList<NewsItem>();
        newsItemList.add(new NewsItem("https://tctechcrunch2011.files.wordpress.com/2016/08/gettyimages-584268466.jpg?w=764&amp;h=400&amp;crop=1",
                "New York Governor signs daily fantasy sports bill, DraftKings and FanDuel can operate again",
                "By Fitz Tepper",
                "Back in June on the last day of the New York Assembly's legislative session, the state passed a bill legalizing daily fantasy sports, paving the road for the..",
                "http://social.techcrunch.com/2016/08/03/new-york-governor-signs-daily-fantasy-sports-bill-draftkings-and-fanduel-can-operate-again/"));
        newsItemList.add(new NewsItem("https://img.vidible.tv/prod/2016-08/03/57a274e1134aa15a39f04209_1280x720_U_v1_764_400.jpg",
                "Crunch Report | First private company to go to the Moon",
                "By Khaled \"Tito\" Hamze",
                "Moon Express is the first private company to get permission from the U.S. government to go to the moon, Facebook shows us its \"Area 404\" hardware lab, Tesla..",
                "http://social.techcrunch.com/2016/08/03/crunch-report-first-private-company-to-go-to-the-moon/"));
        return newsItemList;
    }

}
