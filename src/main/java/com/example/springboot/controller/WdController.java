package com.example.springboot.controller;
import com.example.springboot.controller.geshi.R;
import com.example.springboot.entity.SdPerson;
import com.example.springboot.entity.WdPerson;
import com.example.springboot.service.iml.WdIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("wd")
public class WdController {
    @Autowired
    private WdIml wdIml;
    @GetMapping
    public R getAll() {
        return new R(true,wdIml.list());
    }
    @PutMapping
    public R upData(@RequestBody WdPerson wdperson){
        return  new R(wdIml.updateById(wdperson));
    }
//    @GetMapping("{id}")
//    public R get(@PathVariable Integer id){
//        return new R(true,wdIml.getById(id));
//    }
}
