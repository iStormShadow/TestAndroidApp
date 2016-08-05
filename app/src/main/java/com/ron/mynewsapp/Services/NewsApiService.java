package com.ron.mynewsapp.Services;

import com.ron.mynewsapp.model.NewsResponse;
import com.ron.mynewsapp.model.NewsSourceResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by admin on 8/5/2016.
 */

public class NewsApiService {

    private static final String BASEURL="https://newsapi.org/v1/";
    private static final String APIKEY="70d54fb3cf61407caa42e850d311f82c";

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

    public interface NewApiInterface {
        @GET("articles?apiKey=" + APIKEY)
        Call<NewsResponse> getArticles(@Query("source") String source, @Query("sortBy") String sortBy);

        @GET("sources")
        Call<NewsSourceResponse> getSources();
    }

}
