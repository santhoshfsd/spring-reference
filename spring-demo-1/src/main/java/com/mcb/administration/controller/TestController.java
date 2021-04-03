package com.mcb.administration.controller;

import com.mcb.administration.dto.HttpResponse;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @ApiImplicitParams({
            @ApiImplicitParam(name="Authorization", value = "Auth Token", required = true, dataType = "string",
             paramType = "header")
    })
    @ApiOperation(
            value = "List all people",
            notes = "List all people using paging",
            response = HttpResponse.class,
            responseContainer = "List"
    )
    @GetMapping
    public ResponseEntity<HttpResponse> testRoute () {
        return  new ResponseEntity<HttpResponse>(new HttpResponse("test route success","",200),
                HttpStatus.ACCEPTED);
    }

}
