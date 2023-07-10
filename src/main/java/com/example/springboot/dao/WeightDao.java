package com.example.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.entity.WeightPerson;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WeightDao extends BaseMapper<WeightPerson> {
}
