package com.example.springboot.controller;

import com.example.springboot.controller.geshi.R;
import com.example.springboot.entity.SdPerson;
import com.example.springboot.service.SdServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/sd")
public class SdController {
    @Autowired
    private SdServer sdServer;
    @GetMapping
    public R getAll() {
        return new R(true,sdServer.list());
    }
    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true,sdServer.getById(id));
    }
    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(true,sdServer.removeById(id));
    }
    @PutMapping
    public R upData(@RequestBody SdPerson sdperson){
        return  new R(sdServer.updateById(sdperson));
    }
    @PostMapping("/save")
    public R save(@RequestBody SdPerson sdperson){
        return new R(sdServer.save(sdperson));
    }

}
