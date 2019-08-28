package com.huayan.hbms.service;

import com.huayan.hbms.domain.entity.Coffee;
import com.huayan.hbms.domain.entity.Ice;
import com.huayan.hbms.domain.entity.Ielse;
import com.huayan.hbms.domain.entity.Steak;

import java.util.List;

public interface GoodsService {
    List<Coffee> findCoffeeAll();
    Coffee findCoffee(int id);
    int updateCoffee(int id,Coffee coffee);
    int deleteCoffee(int id);
    int insertCoffee(Coffee coffee);

    List<Steak> findSteakAll();
    Steak findSteak(int id);
    int updateSteak(int id,Steak steak);
    int deleteSteak(int id);
    int insertSteak(Steak steak);

    List<Ice> findIceAll();
    Ice findIce(int id);
    int updateIce(int id,Ice ice);
    int deleteIce(int id);
    int insertIce(Ice ice);

    List<Ielse> findIelseAll();
    Ielse findIelse(int id);
    int updateIelse(int id,Ielse ielse);
    int deleteIelse(int id);
    int insertIelse(Ielse ielse);
}
