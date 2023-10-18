package com.client.model;

import lombok.Data;

@Data
public class Payment {
    private Long id;
    private String createdDate;
    private String createdBy;
    private String updatedDate;
    private String updatedBy;
    private Reservation reservation;
    private Customer customer;
    private Room room;
    private RoomType roomType;
    private RoomFacility roomFacilities;
    private int amountPaid;
    private String status;
}
