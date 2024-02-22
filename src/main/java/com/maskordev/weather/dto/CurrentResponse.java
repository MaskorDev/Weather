package com.maskordev.weather.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrentResponse {
    private Current current;
    private Location location;
}

