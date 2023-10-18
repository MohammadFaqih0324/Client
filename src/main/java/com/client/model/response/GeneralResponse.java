package com.client.model.response;
import lombok.Data;

@Data
public class GeneralResponse<E> {
    private Long code;
    private String status;
    private String message;
    private E data;
}