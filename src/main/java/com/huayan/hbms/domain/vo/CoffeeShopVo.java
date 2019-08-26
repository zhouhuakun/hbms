package com.huayan.hbms.domain.vo;

import com.huayan.hbms.domain.entity.*;
import lombok.Data;

import java.util.List;

@Data
public class CoffeeShopVo extends CoffeeShop {
    List<Coffee> coffeeList;
    List<Steak> steakList;
    List<Ice> iceList;
    List<Ielse> ielseList;
}
