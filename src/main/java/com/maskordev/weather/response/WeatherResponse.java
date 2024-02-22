package com.maskordev.weather.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherResponse {
    private double temp_c;
    private double feelslike_c;
}
