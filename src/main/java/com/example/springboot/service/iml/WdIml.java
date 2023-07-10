package com.example.springboot.service.iml;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.dao.WdDao;
import com.example.springboot.entity.WdPerson;
import com.example.springboot.service.WdServer;
import org.springframework.stereotype.Service;

@Service
public class WdIml extends ServiceImpl<WdDao,WdPerson> implements WdServer {
}
