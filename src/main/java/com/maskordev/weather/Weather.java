package com.maskordev.weather;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class Weather {
    public static final String BASE_URL = "https://api.weatherapi.com/";

    private static Retrofit retrofit;

    private static WeatherApi instance;

    public static final String API_KEY = "c4b4b97b53db4ec29c172030242701";
    public static GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create();


    private static WeatherApi init() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(gsonConverterFactory)
                .build();

        WeatherApi api = retrofit.create(WeatherApi.class);
        return api;
    }

    public static WeatherApi instance() {
        if (instance == null) {
            instance = init();
        }
        return instance;
    }



}
