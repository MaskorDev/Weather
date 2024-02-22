package DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class CurrentResponse {
    private Current current;
    private Location location;
}

