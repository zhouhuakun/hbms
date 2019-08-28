package com.huayan.hbms.controller;

import com.huayan.hbms.domain.entity.Coffee;
import com.huayan.hbms.service.GoodsService;
import com.huayan.hbms.utils.Result;
import jdk.nashorn.internal.ir.RuntimeNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    GoodsService goodsService;

    @RequestMapping("/coffee")
    public Result selectcoffee(){
        List<Coffee> coffees=null;
        try {
            coffees = goodsService.findCoffeeAll();
            return Result.success(coffees);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return Result.error(coffees);
        }

    }
}
