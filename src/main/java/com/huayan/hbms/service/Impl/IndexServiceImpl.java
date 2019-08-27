package com.huayan.hbms.service.Impl;

import com.huayan.hbms.domain.vo.CoffeeShopVo;
import com.huayan.hbms.mapper.CoffeeShopMapper;
import com.huayan.hbms.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class IndexServiceImpl implements IndexService {
    @Resource
    CoffeeShopMapper coffeeShopMapper;
    @Override
    public List<CoffeeShopVo> getHeader() {
        List<CoffeeShopVo> coffeeShopVos = coffeeShopMapper.findAll();
        return coffeeShopVos;
    }
}
