package com.client.controller;

import com.client.model.request.AddPaymentRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${smart.home.stay.base.url}")
    private String smartHomeStayBaseUrl;

    RestTemplate restTemplate = new RestTemplate();

    @PostMapping("/resttemplate/create")
    public Object addPayment(@RequestBody AddPaymentRequest addPaymentRequest) {
       try {
            String url = smartHomeStayBaseUrl.concat("/payment/create");

           HttpEntity requestBody = new HttpEntity<>(addPaymentRequest);
       }catch (Exception e){

       }
        return null;
    }
}
