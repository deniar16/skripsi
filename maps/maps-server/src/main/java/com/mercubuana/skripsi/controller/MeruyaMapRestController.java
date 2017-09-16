package com.mercubuana.skripsi.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.mercubuana.skripsi.entity.Map;

@RestController
public class MeruyaMapRestController {
	
    @RequestMapping(value = "/rest/get_currenct_location", method = RequestMethod.GET)
    public @ResponseBody String getAllPeople() throws IOException, Exception {
    	
        String jsonData = convertToJsonData(new Map(1l, "123123123", "31312312231"));
        return jsonData;
    }

    private String convertToJsonData(Map map) throws IOException {        
        Gson gson = new Gson();
        return gson.toJson(map);
    }
}
