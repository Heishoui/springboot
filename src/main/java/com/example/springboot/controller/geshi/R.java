package com.example.springboot.controller.geshi;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lombok.Data;

@Data
public class R {
    private boolean flag;
    private Object data;
    public R(Object data){
        this.data=data;
    }
    public R(boolean flag,Object data){
        this.data=data;
        this.flag=flag;
    }
}
