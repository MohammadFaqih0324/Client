package com.client.model;

import lombok.Data;

@Data
public class RoomFacility {
    private Long id;
    private String createdDate;
    private String createdBy;
    private String updatedDate;
    private String updatedBy;
    private String name;
    private int price;
    private String description;
}