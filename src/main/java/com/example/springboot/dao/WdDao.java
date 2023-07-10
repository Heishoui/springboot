package com.example.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.entity.WdPerson;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WdDao extends BaseMapper<WdPerson> {
}
