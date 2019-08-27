package com.hunyan.hbms.service.impl;

import com.huayan.hbms.domain.vo.CoffeeShopVo;
import com.huayan.hbms.mapper.CoffeeShopMapper;
import com.huayan.hbms.service.Impl.IndexServiceImpl;
import com.huayan.hbms.service.IndexService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
@ContextConfiguration({
        "classpath:spring-context.xml",
        "classpath:spring-mybatis.xml",
        "classpath:spring-mvc.xml",
})
public class IndexSerciceImplTest {
    @Resource
    IndexServiceImpl indexService;
    @Test
    public void test1(){
        List<CoffeeShopVo> header = indexService.getHeader();
        System.out.println(File.separator);
    }
}
