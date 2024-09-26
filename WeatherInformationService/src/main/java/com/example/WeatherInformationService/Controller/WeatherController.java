package com.example.WeatherInformationService.Controller;

import com.example.WeatherInformationService.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weatherService")
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("GetWeatherInfo")
    public ResponseEntity<Object> GetWeatherInfo(@RequestParam("city") String city, @RequestParam("apiKey") String apiKey) {

        try {
            Object response = weatherService.GetWeatherInfo(city, apiKey);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
