package com.ibegu.dalaoadmin.service;

import com.ibegu.dalaoadmin.domain.Demo;
import com.ibegu.dalaoadmin.domain.Test;
import com.ibegu.dalaoadmin.mapper.DemoMapper;
import com.ibegu.dalaoadmin.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Author Angus Lan
 * @Date 2021/4/10 3:45
 **/

@Service
public class DemoService {

    // @Autowired
    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list(){


        return demoMapper.selectByExample(null);
        // return demoMapper.selectByExample(new DemoExample());
    }



}