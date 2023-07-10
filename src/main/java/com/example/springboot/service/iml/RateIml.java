package com.example.springboot.service.iml;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.dao.RateDao;
import com.example.springboot.entity.RatePerson;
import com.example.springboot.service.RateServer;
import org.springframework.stereotype.Service;

@Service
public class RateIml extends ServiceImpl<RateDao, RatePerson> implements RateServer {
}
