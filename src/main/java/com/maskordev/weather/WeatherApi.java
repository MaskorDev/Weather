package com.maskordev.weather;

import com.maskordev.weather.dto.CurrentResponse;
import com.maskordev.weather.response.WeatherResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface WeatherApi {

    @GET("/v1/current.json")
    Call<CurrentResponse> posts(@Query("key") String apiKey, @Query("q") String city);
}
