package com.example.springboot;


import com.example.springboot.dao.ImageDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {
    @Autowired
    private ImageDao imageDao;
    @Test
    void TestGetById() {
    }}
