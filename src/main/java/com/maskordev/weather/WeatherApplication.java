package com.maskordev.weather;

import com.maskordev.weather.dto.CurrentResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class WeatherApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(WeatherApplication.class, args);

	}

}
