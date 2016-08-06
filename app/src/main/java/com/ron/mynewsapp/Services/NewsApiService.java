package com.ron.mynewsapp.Services;

import com.ron.mynewsapp.model.JiraResponse;
import com.ron.mynewsapp.model.NewsResponse;
import com.ron.mynewsapp.model.NewsSourceResponse;

import org.json.JSONObject;

import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by admin on 8/5/2016.
 */

public class NewsApiService {

    private static final String BASEURL="https://newsapi.org/v1/";
    private static final String APIKEY="70d54fb3cf61407caa42e850d311f82c";
    private static final String JIRAURL="https://jira.sp.vodafone.com";
    private static final String AVATARURL="https://jira.sp.vodafone.com/secure/projectavatar?pid=15776&avatarId=10011";

    private static NewApiInterface newsInterface;

    public static NewApiInterface getNewsApiResponse () {
        if(newsInterface == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASEURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            newsInterface = retrofit.create(NewApiInterface.class);
         }
        return newsInterface;
    }

    public static NewApiInterface getNewsSources () {
        if(newsInterface == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASEURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            newsInterface = retrofit.create(NewApiInterface.class);
        }
        return newsInterface;
    }

    public static NewApiInterface getJiraResponse () {
        if(newsInterface == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(JIRAURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            newsInterface = retrofit.create(NewApiInterface.class);
        }
        return newsInterface;
    }

    public interface NewApiInterface {
        @GET("articles?apiKey=" + APIKEY)
        Call<NewsResponse> getArticles(@Query("source") String source, @Query("sortBy") String sortBy);

        @GET("sources")
        Call<NewsSourceResponse> getSources();

        @Headers("Authorization: Basic cmF1bmFrLm5hdGh3YW5pQHZvZGFmb25lLmNvbToxNElkb250a25vdw==")
        @GET("/rest/api/2/project/15776")
        Call<JiraResponse> getJiraResponse();
    }

}
