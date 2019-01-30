package com.springboot.demo.service;


import com.springboot.demo.bean.Tuser;

import java.util.List;

public interface TuserService {

    List<Tuser> getAll();

    void insert(Tuser user);
}
