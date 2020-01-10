package com.itlike.service;

import com.itlike.mapper.HeroMapper;
import com.itlike.pojo.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HeroServiceImpl implements HeroService {

    @Autowired
    private HeroMapper heroMapper;
    private List<Hero> heroes;

    @Override
    public List<Hero> getAllHero() {
        List<Hero> heroes = heroMapper.selectAll();
        System.out.println(heroes);
        return heroMapper.getAllHero();
    }
}
