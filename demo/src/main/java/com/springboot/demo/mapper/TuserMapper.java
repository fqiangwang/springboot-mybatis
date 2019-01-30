package com.springboot.demo.mapper;

import com.springboot.demo.bean.*;

import java.util.List;

public interface TuserMapper {

    List<Tuser> getAllUser();

    void insert(Tuser tuser);
}
