package com.ibegu.dalaoadmin.service;

import com.ibegu.dalaoadmin.domain.Demo;
import com.ibegu.dalaoadmin.domain.DemoExample;
import com.ibegu.dalaoadmin.domain.Test;
import com.ibegu.dalaoadmin.mapper.DemoMapper;
import com.ibegu.dalaoadmin.mapper.TestMapper;
import com.ibegu.dalaoadmin.req.DemoReq;
import com.ibegu.dalaoadmin.resp.DemoResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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

    public List<DemoResp> list(DemoReq demoReq){

        DemoExample demoExample = new DemoExample();
        DemoExample.Criteria criteria = demoExample.createCriteria();
        criteria.andNameLike("%" + demoReq.getName() + "%");

        List<Demo> demoList = demoMapper.selectByExample(demoExample);


        //利用循环从将demo封装为demoresp
        List<DemoResp> demoRespList = new ArrayList<>();
        for (Demo demo : demoList) {
            DemoResp demoResp = new DemoResp();
            BeanUtils.copyProperties(demo, demoResp);
            // demoResp.setId(123L);
            demoRespList.add(demoResp);
        }

        return demoRespList;


        // return demoMapper.selectByExample(new DemoExample());
    }





}