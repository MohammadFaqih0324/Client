package com.client.model;

import lombok.Data;

@Data
public class RoomType {
    private Long id;
    private String createdDate;
    private String createdBy;
    private String updatedDate;
    private String updatedBy;
    private String name;
    private String description;
    private int pricePerNight;
}
