package com.huayan.hbms.mapper;

import com.huayan.hbms.domain.entity.CoffeeShop;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CoffeeShopMapper  {
    List<CoffeeShop> findAll();
}