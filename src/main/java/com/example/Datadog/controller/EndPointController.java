package com.example.Datadog.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EndPointController {

    @Timed(value = "fasterEndPoint", description = "This Endpoint process the data faster")
    @PostMapping("/fast")
    public ResponseEntity getFast(@RequestParam Integer duration) throws InterruptedException {
        Thread.sleep(duration);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Timed(value = "slowerEndPoint", description = "This Endpoint process the data slower")
    @PostMapping("/slow")
    public ResponseEntity getSlow(@RequestParam Integer duration) throws InterruptedException {
        Thread.sleep(duration);
        return new ResponseEntity(HttpStatus.OK);
    }
}
