package com.huayan.hbms.mapper;

import com.huayan.hbms.domain.entity.Coffee;
import com.huayan.hbms.domain.entity.CoffeeShop;
import org.apache.ibatis.annotations.Param;

public interface CoffeeMapper  {
    Coffee findbyId(@Param("coffeeId") int id);
    int update(@Param("coffeeId")int id,@Param("coffee") Coffee coffee);
    int delete(@Param("coffeeId")int id);
    int insert(@Param("coffee") Coffee coffee);
}