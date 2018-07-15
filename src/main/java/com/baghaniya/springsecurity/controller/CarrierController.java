package com.baghaniya.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by RAHUL on Jul, 2018
 */
@RestController
@RequestMapping(value = "/config")
public class CarrierController {

    @RequestMapping(value = "/carriers", method = RequestMethod.GET)
    @PreAuthorize("hasRole('USER')")
    public String getCarrier(){
        return "carriers";
    }

}
