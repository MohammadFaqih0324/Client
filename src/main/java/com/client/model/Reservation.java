package com.client.model;

import lombok.Data;

import java.util.List;

@Data
public class Reservation {
    private Long id;
    private String createdDate;
    private String createdBy;
    private String updatedDate;
    private String updatedBy;
    private Customer customer;
    private Room room;
    private List<RoomFacility> roomFacilities;
    private String checkInDate;
    private String checkOutDate;
    private int totalNight;
    private int totalPrice;
    private String status;
}
