package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("rice_rate")
public class RatePerson {
    private Integer id;
    private String ricerate;
    private String brokenrate;
    private String illrate;
}
