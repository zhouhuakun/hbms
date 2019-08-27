package com.huayan.hbms.mapper;

import com.huayan.hbms.domain.entity.Steak;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SteakMapper  {
    Steak findbyId(@Param("SteakId") int id);
    int update(@Param("SteakId")int id, @Param("steak") Steak steak);
    int delete(@Param("SteakId")int id);
    int insert(@Param("steak") Steak steak);
}