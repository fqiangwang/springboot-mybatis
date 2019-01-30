package com.springboot.demo.service.impl;

import com.springboot.demo.bean.Tuser;
import com.springboot.demo.mapper.TuserMapper;
import com.springboot.demo.service.TuserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
@Configuration
public class TuserServiceImpl implements TuserService {

    @Autowired
    TuserMapper userMapper;

    private static final Logger logger = LoggerFactory.getLogger(TuserServiceImpl.class);

    @Override
    public List<Tuser> getAll() {
        logger.info("=================test===============");
        return userMapper.getAllUser();
    }

    @Override
    public void insert(Tuser tuser) {
        userMapper.insert(tuser);
    }
}
