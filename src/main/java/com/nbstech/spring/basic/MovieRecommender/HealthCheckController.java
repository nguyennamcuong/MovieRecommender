package com.nbstech.spring.basic.MovieRecommender;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController

public class HealthCheckController {
    @GetMapping("/health")
//	@RequestMapping(method=RequestMethod.GET, value="/movies")
    public String checkHealth(){
        return "I'm still alive";
    }
}
