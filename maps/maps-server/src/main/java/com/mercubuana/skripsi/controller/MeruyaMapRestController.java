package com.mercubuana.skripsi.controller;

import java.io.IOException;

import com.mercubuana.skripsi.repositories.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.mercubuana.skripsi.entity.Map;
import com.mercubuana.skripsi.model.MapLocation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MeruyaMapRestController {

    @Autowired
    public MapRepository mapRepository;

    @RequestMapping(value = "/rest/get_current_location", method = RequestMethod.POST)
    public ResponseEntity<String> getCurrentLocation(@RequestBody
            MapLocation json) {
        System.out.println(json.getLatitude() +", "+ json.getLongitude());
        Map map = mapRepository.findByLatitudeAndLongitude(Double.valueOf(json.getLatitude()), Double.valueOf(json.getLongitude()));
        if (map != null) {
            return new ResponseEntity<>(map.getId().toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("-1", HttpStatus.OK);
        }
    }
}
