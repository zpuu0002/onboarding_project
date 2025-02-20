package com.example.onboarding_backend.controller;

import com.example.onboarding_backend.entity.Geo;
import com.example.onboarding_backend.mapper.GeoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class GeoController {
    @Autowired
    private GeoMapper geoMapper;
    @GetMapping("/geo")
    public List<Geo> query()
    {
        List<Geo> geoList = geoMapper.find();
        System.out.println(geoList);
        return geoList;
    }
}
