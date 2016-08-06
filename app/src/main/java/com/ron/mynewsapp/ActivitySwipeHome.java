package com.ron.mynewsapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ron.mynewsapp.Services.NewsApiService;
import com.ron.mynewsapp.model.NewsSourceResponse;
import com.ron.mynewsapp.model.Source;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.ron.mynewsapp.NewsFragment.SOURCE_NAME;

public class ActivitySwipeHome extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_home);
        viewPager = (ViewPager) findViewById(R.id.swipe_home_pager);
        Call<NewsSourceResponse> responseCall = NewsApiService.getNewsSources().getSources();
        responseCall.enqueue(new Callback<NewsSourceResponse>() {
            @Override
            public void onResponse(Call<NewsSourceResponse> call, Response<NewsSourceResponse> response) {
                List<Source> sourceList = response.body().getSources();
                ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), sourceList);
                viewPager.setAdapter(viewPagerAdapter);
            }

            @Override
            public void onFailure(Call<NewsSourceResponse> call, Throwable t) {

            }
        });
    }

    public class ViewPagerAdapter extends FragmentStatePagerAdapter {
        List<Source> sources;

        public ViewPagerAdapter(FragmentManager fm, List<Source> sources) {
            super(fm);
            this.sources = sources;
        }

        @Override
        public Fragment getItem(int position) {
            return NewsFragment.generateFragment(sources.get(position));
        }

        @Override
        public int getCount() {
            return sources.size();
        }


    }

}
