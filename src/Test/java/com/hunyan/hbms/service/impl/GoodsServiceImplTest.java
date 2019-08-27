package com.hunyan.hbms.service.impl;

import com.huayan.hbms.service.GoodsService;
import com.huayan.hbms.service.Impl.GoodsServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
@ContextConfiguration({
        "classpath:spring-context.xml",
        "classpath:spring-mybatis.xml",
        "classpath:spring-mvc.xml",
})
public class GoodsServiceImplTest {
    @Resource
    GoodsService goodsService;
    @Test
    public void test1(){
        int i = goodsService.deleteCoffee(5);
        System.out.println(i);
    }
    @Test
    public void test2(){
        int i = goodsService.deleteSteak(12);
        System.out.println(i);
    }
}
