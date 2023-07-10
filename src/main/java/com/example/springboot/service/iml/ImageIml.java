package com.example.springboot.service.iml;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.dao.ImageDao;
import com.example.springboot.entity.ImagePerson;
import com.example.springboot.service.ImageServer;
import org.springframework.stereotype.Service;


@Service
public class ImageIml extends ServiceImpl<ImageDao, ImagePerson> implements ImageServer{
}
