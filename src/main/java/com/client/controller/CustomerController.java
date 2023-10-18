package com.client.controller;

import com.client.model.Customer;
import com.client.model.request.AddCustomerRequest;
import com.client.model.response.GeneralResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Value("${smart.home.stay.base.url}")
    private String smartHomeStayBaseUrl;

    RestTemplate restTemplate = new RestTemplate();

    @PostMapping("/resttemplate/register")
    public Object addCustomer(@RequestBody AddCustomerRequest addCustomerRequest){
        log.info("incoming request register customer");
        try {
            String url = smartHomeStayBaseUrl.concat("/customer/register");

            HttpEntity requestBody = new HttpEntity<>(addCustomerRequest);
            ParameterizedTypeReference<GeneralResponse<Customer>> responseBody = new ParameterizedTypeReference<GeneralResponse<Customer>>() {};
            ResponseEntity<GeneralResponse<Customer>> result = restTemplate.exchange(url, HttpMethod.POST, requestBody, responseBody);
            return result.getBody();
        }catch (Exception e){
            log.error("error {}", e.getMessage());
            return new ResponseEntity<GeneralResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
