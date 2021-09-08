package com.xud.dao;

import com.xud.domain.Play;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Play record);

    Play selectByPrimaryKey(Long id);

    List<Play> selectAll(String filmId);

    int updateSeat(@Param("seat") String seat, @Param("playId") String playId);

    Play getPlayByPlayId(String playId);
    String getSeatInfo(String playId);
}