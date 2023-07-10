package com.example.springboot.controller;
import com.example.springboot.controller.geshi.R;
import com.example.springboot.entity.ImagePerson;
import com.example.springboot.service.iml.ImageIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("image")
public class ImageController {
    @Autowired
    private ImageIml imageIml;
    @Resource
    UploadController uploadController;
    @GetMapping
    public R getAll() {
        return new R(true,imageIml.list());
    }
    @PostMapping
    public String add(@RequestBody ImagePerson imagePerson){
        imagePerson.setImage(uploadController.imageUrl);
        imagePerson.setId(2);
        imageIml.save(imagePerson);
        return "已保存";
    }
}

