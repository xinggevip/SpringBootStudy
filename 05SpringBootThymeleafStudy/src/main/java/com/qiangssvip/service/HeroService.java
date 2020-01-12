package com.qiangssvip.service;

import com.qiangssvip.pojo.Hero;

import java.util.List;

public interface HeroService {
    List<Hero> getAllHero();

    void inserrtHero(Hero hero);

    Hero getHeroWithId(Integer id);

    void upateHero(Hero hero);
}
