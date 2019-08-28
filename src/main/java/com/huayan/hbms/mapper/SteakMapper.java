package com.huayan.hbms.mapper;

import com.huayan.hbms.domain.entity.Coffee;
import com.huayan.hbms.domain.entity.Steak;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SteakMapper  {
    List<Steak> findAll();
    Steak findbyId(@Param("SteakId") int id);
    int update(@Param("SteakId")int id, @Param("steak") Steak steak);
    int delete(@Param("SteakId")int id);
    int insert(@Param("steak") Steak steak);
}