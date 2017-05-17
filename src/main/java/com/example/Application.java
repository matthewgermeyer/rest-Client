package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();

        //EventBrite Header
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Authorization","Bearer QFMYBY4KGDFYNWRPDLRJ");
//        HttpEntity<String> entity = new HttpEntity<>(headers);
//
//        ResponseEntity<EventbriteUser> responseEntity = restTemplate.exchange("https://www.eventbriteapi.com/v3/users/me/",HttpMethod.GET,entity,EventbriteUser.class);
//        System.out.println(responseEntity.getBody().toString());

        //Beeminder Headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization","Bearer 7YizwMH-zUyksCw_2knd");
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<BeeminderUser> responseEntity = restTemplate.exchange("https://www.beeminder.com/api/v1/users/me?auth_token=7YizwMH-zUyksCw_2knd/",HttpMethod.GET,entity,BeeminderUser.class);
        System.out.println(responseEntity.getBody().toString());




                 //Random Turnquist Quotes:
        //Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        //log.info(quote.toString());

    }
}
