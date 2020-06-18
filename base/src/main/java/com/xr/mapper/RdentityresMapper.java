package com.xr.mapper;

import com.xr.entity.Rdentityresponsibility;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RdentityresMapper {

    @Select("SELECT r.id,r.title,r.content,r.create_time,u.username,r.staus FROM rd_entity_responsibility r,sys_user u WHERE r.create_id=u.id AND r.title LIKE CONCAT('%','#{title}','%')")
    List<Rdentityresponsibility> selectRdentityres(Rdentityresponsibility rdentityresponsibility);
}
