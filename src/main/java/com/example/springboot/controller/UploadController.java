package com.example.springboot.controller;
import com.example.springboot.entity.ImagePerson;
import com.example.springboot.service.iml.ImageIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("upload")
public class UploadController {
    @Autowired
    private ImageIml imageIml;
    String imageUrl;
    SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");
    @PostMapping("/upload")
    public Map<String,Object> fileupload(MultipartFile file, HttpServletRequest req) {
        Map<String, Object> result = new HashMap<>();
        String format = sdf.format(new Date());
        String realPath = req.getServletContext().getRealPath("/") + format;
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String oldName = file.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
        try {
            file.transferTo(new File(folder, newName));
            String url = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + format + newName;
            this.imageUrl = url;
            result.put("status", "OK");
            result.put("name", oldName);
            result.put("url", url);
        } catch (IOException e) {
            result.put("status", "ERROR");
            result.put("msg", e.getMessage());
        }
        return result;
    }
    @GetMapping("/img")
      public String addimgurl(@RequestBody ImagePerson imagePerson){
        System.out.println(imagePerson);
        return "ok";
    }   
    }