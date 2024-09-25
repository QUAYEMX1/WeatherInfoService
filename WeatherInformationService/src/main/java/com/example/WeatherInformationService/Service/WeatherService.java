package com.example.WeatherInformationService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Autowired
    RestTemplate restTemplate;
    private final String baseUrl="http://api.openweathermap.org/data/2.5/weather?q=";
    public Object GetWeatherInfo(String city, String apiKey) {

        String url=prepareUrl(city,apiKey);
        Object response=restTemplate.getForObject(url, Object.class);

        return response;
    }

    private String prepareUrl(String city, String apiKey) {

        String res=baseUrl+city+'&'+ "apiKey="+apiKey;
        return res;
    }
}
