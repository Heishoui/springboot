package com.example.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.entity.RatePerson;
import org.apache.ibatis.annotations.Mapper;

import javax.xml.ws.soap.MTOM;

@Mapper
public interface RateDao extends BaseMapper<RatePerson> {
}
