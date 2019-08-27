package com.huayan.hbms.controller;

import com.huayan.hbms.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@Slf4j
@RequestMapping("/index")
public class GoodsController {
    @Resource
    GoodsService goodsService;

}
