package com.example.news;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Fragment> list = new ArrayList<>();
    List<String> strlist = new ArrayList<>();
    private TabLayout mytab;
    private ViewPager vp;
    private ImageView news;
    private ImageView movies;
    private ImageView video;
    private RadioGroup  rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initAdapter();
        initListener();
    }

    private void initListener() {
        //TODO   新闻
       news.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               vp.setCurrentItem(0);
               mytab.setVisibility(View.VISIBLE);
           }
       });
       //TODO  电影
        movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vp.setCurrentItem(1);
                mytab.setVisibility(View.GONE);
            }
        });
        //TODO  音频
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vp.setCurrentItem(2);
                mytab.setVisibility(View.GONE);
            }
        });
    }

    private void initAdapter() {
        Myadapter myadapter = new Myadapter(getSupportFragmentManager(), list, strlist);
        vp.setAdapter(myadapter);
        mytab.setupWithViewPager(vp);
    }

    private void initData() {
        list.add(new NewsFragment());
        list.add(new MovieFragment());
        list.add(new VideoFragment());
        strlist.add("头条");
        strlist.add("NBA");
        strlist.add("webveiw");
    }

    private void initView() {
        mytab = (TabLayout) findViewById(R.id.mytab);
        vp = (ViewPager) findViewById(R.id.vp);
        news = (ImageView) findViewById(R.id.news);
        movies = (ImageView) findViewById(R.id.movies);
        video = (ImageView) findViewById(R.id.video);
        rg = findViewById(R.id.rg);
    }
}
