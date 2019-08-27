package com.huayan.hbms.mapper;

import com.huayan.hbms.domain.entity.Ielse;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface IelseMapper  {
    Ielse findbyId(@Param("elseId") int id);
    int update(@Param("elseId")int id,@Param("ielse") Ielse ielse);
    int delete(@Param("elseId")int id);
    int insert(@Param("ielse") Ielse ielse);
}