package com.mercubuana.skripsi.controller;

import java.io.IOException;

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

//    @RequestMapping(value = "/rest/get_current_location", method = RequestMethod.GET)
//    public @ResponseBody String getAllPeople() throws IOException, Exception {
//    	
//        String jsonData = convertToJsonData(new Map(1l, "123123123", "31312312231"));
//        return jsonData;
//    }
    @RequestMapping(value = "/rest/get_current_location", method = RequestMethod.POST)
    public ResponseEntity<String> getCurrentLocation(@RequestBody
            MapLocation json) {
        System.out.println(json.getLatitude());
        return new ResponseEntity<>("100", HttpStatus.OK);
    }

    private String convertToJsonData(Map map) throws IOException {
        Gson gson = new Gson();
        return gson.toJson(map);
    }
}
