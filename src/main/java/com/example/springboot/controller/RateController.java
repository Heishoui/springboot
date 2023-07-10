package com.example.springboot.controller;

import com.example.springboot.controller.geshi.R;
import com.example.springboot.service.RateServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/rate")
public class RateController {
    @Autowired
    private RateServer rateServer;
    @GetMapping
    public R getAll(){
        return new R(true, rateServer.list());
    }
    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true, rateServer.getById(id));
    }
}
