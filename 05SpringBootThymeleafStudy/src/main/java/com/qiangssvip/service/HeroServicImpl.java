package com.qiangssvip.service;

import com.qiangssvip.mapper.HeroMapper;
import com.qiangssvip.pojo.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HeroServicImpl implements HeroService {

    @Autowired
    private HeroMapper heroMapper;

    @Override
    public List<Hero> getAllHero() {
        return heroMapper.selectAll();
    }

    @Override
    public void inserrtHero(Hero hero) {
        try {
            heroMapper.insert(hero);
        }catch (Exception e){
            System.out.println("插入英雄记录异常");
        }

    }
}
