package com.maskordev.weather.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Current {
    private long last_updated_epoch;
    private String last_updated;
    private double temp_c;
    private double temp_f;
    private int is_day;
    private Condition condition;

    private double wind_mph;
    private double wind_kph;
    private int wind_degree;
    private String wind_dir;
    private int pressure_mb;
    private double pressure_in;
    private Double precip_mm;
    private Double precip_in;
    private int humidity;
    private int cloud;
    private double feelslike_c;
    private double feelslike_f;
    private Double vis_km;
    private Double vis_miles;
    private int uv;
    private double gust_mph;
    private double gust_kph;

}
