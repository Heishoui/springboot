package com.example.springboot.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.entity.ImagePerson;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface ImageDao extends BaseMapper<ImagePerson> {
}
