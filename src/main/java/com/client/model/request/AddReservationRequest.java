package com.client.model.request;

import com.client.model.RoomFacility;
import lombok.Data;

import java.util.List;

@Data
public class AddReservationRequest {
    private String checkInDate;
    private String checkOutDate;
    private int customer;
    private int room;
    private List<RoomFacility> roomFacilities;
}