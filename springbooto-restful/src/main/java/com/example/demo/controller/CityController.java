package com.example.demo.controller;

import com.example.demo.domain.City;
import com.example.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Lino on 2017/6/21.
 */
@RestController
@RequestMapping("/api")
public class CityController {
    @Autowired
    private CityRepository cityRepository;

    @RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id) {
        return cityRepository.findOne(id);
    }

    @RequestMapping(value = "/city", method = RequestMethod.GET)
    public List<City> findAllCity() {
        return cityRepository.findAll();
    }

    @RequestMapping(value = "/city", method = RequestMethod.POST)
    public void createCity(@RequestBody City city) {
        cityRepository.save(city);
    }

    @RequestMapping(value = "/city", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city) {
        cityRepository.save(city);
    }

    @RequestMapping(value = "/city/{id}", method = RequestMethod.DELETE)
    public void modifyCity(@PathVariable("id") Long id) {
        cityRepository.delete(id);
    }

}
