package com.example.cab_book_user.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "cab-location", groupId = "cab-book-user-group")
    public void cabLocation(String location){
        System.out.println("Cab location updated to: " + location);
    }
}
