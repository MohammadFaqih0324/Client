package com.client.controller;


import com.client.model.Reservation;
import com.client.model.request.AddReservationRequest;
import com.client.model.response.GeneralResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Value("${smart.home.stay.base.url}")
    private String smartHomeStayBaseUrl;

    RestTemplate restTemplate = new RestTemplate();

    @PostMapping("/resttemplate/add")
    public Object addReservation(@RequestBody AddReservationRequest addReservationRequest) {
        log.info("incoming request add reservation");
        try {
            String url = smartHomeStayBaseUrl.concat("/reservation/add");

            HttpEntity requestBody = new HttpEntity(addReservationRequest);

            ParameterizedTypeReference<GeneralResponse<Reservation>> responseBody = new ParameterizedTypeReference<GeneralResponse<Reservation>>() {};
            ResponseEntity<GeneralResponse<Reservation>> result = restTemplate.exchange(url, HttpMethod.POST, requestBody, responseBody);
            return result.getBody();
        }catch (Exception e){
            log.error("error {}", e.getMessage());
            return new ResponseEntity<GeneralResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}