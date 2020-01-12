package com.qiangssvip.service;

import com.qiangssvip.mapper.HeroMapper;
import com.qiangssvip.pojo.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroServicImpl implements HeroService {

    @Autowired
    private HeroMapper heroMapper;

    @Override
    public List<Hero> getAllHero() {
        return heroMapper.selectAll();
    }
}
