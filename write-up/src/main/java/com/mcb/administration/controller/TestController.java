package com.mcb.administration.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app/v1/read")
public class TestController {

    @GetMapping("/{id}")
        public ResponseEntity<String> getValueById(@PathVariable("id")String id){

        return new ResponseEntity<String>(id,new HttpHeaders(), HttpStatus.OK);
    }

}
