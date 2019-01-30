package com.springboot.demo;
import com.springboot.demo.bean.Tuser;
import com.springboot.demo.mapper.TuserMapper;
import com.springboot.demo.service.TuserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    TuserService userService;

    @Autowired
    TuserMapper userMapper;

    @Test
    public void contextLoads() {
        System.out.print("hello test");
    }

    @Test
    public void getAll(){
         List<Tuser> list = userService.getAll();
        System.out.println(list.get(0).getId());
    }

    @Test
    public void test(){
        List<Tuser> list = userMapper.getAllUser();
        System.out.println(list.get(0).getName());
    }
}

