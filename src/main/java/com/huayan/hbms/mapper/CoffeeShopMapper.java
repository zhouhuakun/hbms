package com.huayan.hbms.mapper;

import com.huayan.hbms.domain.vo.CoffeeShopVo;

import java.util.List;

public interface CoffeeShopMapper  {
    List<CoffeeShopVo> findAll();
}