package com.client.model.request;

import lombok.Data;

@Data
public class AddCustomerRequest {
    private String email;
    private String firstName;
    private String lastName;
    private String nik;
    private String password;
    private String phoneNumber;
    private String username;

}
