package com.example.springboot.controller;

import com.example.springboot.controller.geshi.R;
import com.example.springboot.service.iml.WeightIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kg")
public class WeightController {
    @Autowired
    private WeightIml weightIml;
    @GetMapping
    public R getAll(){
        return new R(true,weightIml.list());
    }
}
