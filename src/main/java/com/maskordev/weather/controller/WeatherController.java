package com.maskordev.weather.controller;

import com.maskordev.weather.Weather;
import com.maskordev.weather.dto.CurrentResponse;
import com.maskordev.weather.exception.CityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

@RestController
public class WeatherController {

    @GetMapping("/getWeather/{city}")
    public String getWeather(@PathVariable String city) throws Throwable {

        Call<CurrentResponse> call = Weather.instance().posts(Weather.API_KEY, city);

        Response<CurrentResponse> response = call.execute();

        if (response.code() == 404) {
            throw new CityNotFoundException();
        }

        System.out.println("Температура в городе: " + response.body().getCurrent().getTemp_c());
        System.out.println("Температура ощущается в городе: " + response.body().getCurrent().getFeelslike_c());


        return "Температура в городе: " + response.body().getCurrent().getTemp_c() + "\n" +
                "Температура ощущается в городе: " + response.body().getCurrent().getFeelslike_c();
    }
}
