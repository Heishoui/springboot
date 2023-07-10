package com.example.springboot.service.iml;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.dao.WeightDao;
import com.example.springboot.entity.WeightPerson;
import com.example.springboot.service.WeightServer;
import org.springframework.stereotype.Service;

@Service
public class WeightIml extends ServiceImpl<WeightDao, WeightPerson> implements WeightServer {
}
