package com.huayan.hbms.controller;

import com.huayan.hbms.domain.vo.CoffeeShopVo;
import com.huayan.hbms.service.IndexService;
import com.huayan.hbms.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/index")
public class IndexController {
    @Resource
    IndexService indexService;
    @GetMapping("/heads")
    public Result getHeaderData(){
        List<CoffeeShopVo> coffeeShopVos=null;
        try {
            coffeeShopVos = indexService.getHeader();
            return Result.success(coffeeShopVos);
        } catch (Exception e) {
            return Result.error(coffeeShopVos);
        }
    }
}
