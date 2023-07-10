package com.example.springboot.service.iml;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.dao.SdDao;
import com.example.springboot.entity.SdPerson;
import com.example.springboot.service.SdServer;
import org.springframework.stereotype.Service;


@Service
public class SdIml extends ServiceImpl<SdDao, SdPerson> implements SdServer {
    }
