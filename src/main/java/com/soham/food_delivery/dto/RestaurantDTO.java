package com.soham.food_delivery.dto;

import lombok.Data;

import java.util.List;

@Data
public class RestaurantDTO {

    private String title;

    private List<String> images;

    private String description;

    private Long id;
}
