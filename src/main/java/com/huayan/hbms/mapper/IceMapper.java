package com.huayan.hbms.mapper;


import com.huayan.hbms.domain.entity.Coffee;
import com.huayan.hbms.domain.entity.Ice;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface IceMapper  {
    List<Ice> findAll();
    Ice findbyId(@Param("IceId") int id);
    int update(@Param("IceId")int id,@Param("ice") Ice ice);
    int delete(@Param("IceId")int id);
    int insert(@Param("ice") Ice ice);
}