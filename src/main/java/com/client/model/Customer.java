package com.client.model;

import lombok.Data;

@Data
public class Customer {
    private Long id;
    private String createdBy;
    private String createdDate;
    private String updatedBy;
    private String updatedDate;
    private String nik;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phoneNumber;
    private String email;
    private String status;
}
