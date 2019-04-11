package com.example.news;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface Myservice {
    @GET("journalismApi")
    Call<Bean> getBeanMap();

}
