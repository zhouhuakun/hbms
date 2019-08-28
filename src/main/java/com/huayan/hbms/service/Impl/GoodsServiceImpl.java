package com.huayan.hbms.service.Impl;

import com.huayan.hbms.domain.entity.Coffee;
import com.huayan.hbms.domain.entity.Ice;
import com.huayan.hbms.domain.entity.Ielse;
import com.huayan.hbms.domain.entity.Steak;
import com.huayan.hbms.mapper.CoffeeMapper;
import com.huayan.hbms.mapper.IceMapper;
import com.huayan.hbms.mapper.IelseMapper;
import com.huayan.hbms.mapper.SteakMapper;
import com.huayan.hbms.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    CoffeeMapper coffeeMapper;
    @Resource
    SteakMapper steakMapper;
    @Resource
    IceMapper iceMapper;
    @Resource
    IelseMapper ielseMapper;

    @Override
    public List<Coffee> findCoffeeAll() {
        List<Coffee> coffees = coffeeMapper.findAll();
        return coffees;
    }

    @Override
    public Coffee findCoffee(int id) {
        Coffee coffee = coffeeMapper.findbyId(id);
        return coffee;
    }

    @Override
    public int updateCoffee(int id, Coffee coffee) {
        int update = coffeeMapper.update(id, coffee);
        return update;
    }

    @Override
    public int deleteCoffee(int id) {
        int delete = coffeeMapper.delete(id);
        return delete;
    }

    @Override
    public int insertCoffee(Coffee coffee) {
        int insert = coffeeMapper.insert(coffee);
        return insert;
    }

    @Override
    public List<Steak> findSteakAll() {
        return steakMapper.findAll();
    }

    @Override
    public Steak findSteak(int id) {
        Steak steak = steakMapper.findbyId(id);
        return steak;
    }

    @Override
    public int updateSteak(int id, Steak steak) {
        int update = steakMapper.update(id, steak);
        return update;
    }

    @Override
    public int deleteSteak(int id) {
        int delete = steakMapper.delete(id);
        return delete;
    }

    @Override
    public int insertSteak(Steak steak) {
        int insert = steakMapper.insert(steak);
        return insert;
    }

    @Override
    public List<Ice> findIceAll() {
        return iceMapper.findAll();
    }

    @Override
    public Ice findIce(int id) {
        Ice ice = iceMapper.findbyId(id);
        return ice;
    }

    @Override
    public int updateIce(int id, Ice ice) {
        int update = iceMapper.update(id, ice);
        return update;
    }

    @Override
    public int deleteIce(int id) {
        int delete = iceMapper.delete(id);
        return delete;
    }

    @Override
    public int insertIce(Ice ice) {
        int insert = iceMapper.insert(ice);
        return insert;
    }

    @Override
    public List<Ielse> findIelseAll() {
        return ielseMapper.findAll();
    }

    @Override
    public Ielse findIelse(int id) {
        Ielse ielse = ielseMapper.findbyId(id);
        return ielse;
    }

    @Override
    public int updateIelse(int id, Ielse ielse) {

        return ielseMapper.update(id,ielse);
    }

    @Override
    public int deleteIelse(int id) {
        return ielseMapper.delete(id);
    }

    @Override
    public int insertIelse(Ielse ielse) {
        return ielseMapper.insert(ielse);
    }
}
