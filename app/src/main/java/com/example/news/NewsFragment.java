package com.example.news;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {
    List<Bean.DataBean.TechBean>   tech;
    private RecyclerView  Recycler;
    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_news, container, false);
        initView(inflate);
        return inflate;
    }

    private void initView(View  view) {
       Recycler = view.findViewById(R.id.myrecycler);

       final MyNewsAdapter myNewsAdapter = new MyNewsAdapter();
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        Recycler.setLayoutManager(manager);
        Recycler.setAdapter(myNewsAdapter);
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Contant.BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                        .build();
        Myservice myservice = retrofit.create(Myservice.class);
        Call<Bean> beanMap = myservice.getBeanMap();
        beanMap.enqueue(new Callback<Bean>() {
            @Override
            public void onResponse(Call<Bean> call, Response<Bean> response) {
               tech = response.body().getData().getTech();
                for(int i = 0;i<tech.size();i++){
                    Log.i("bbb",tech.get(i).getTitle());
                    Log.i("bbb",tech.get(i).getSource());
                }
                Log.e( "onResponse: ",tech.toString() );
                    myNewsAdapter.refresh(tech);
            }
            @Override
            public void onFailure(Call<Bean> call, Throwable t) {
                Log.i("cc",t.getMessage());
            }
        });

    }

}
