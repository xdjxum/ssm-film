package com.xud.dao;

import com.xud.domain.Play;
import java.util.List;

public interface PlayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Play record);

    Play selectByPrimaryKey(Long id);

    List<Play> selectAll(String filmId);

    int updateByPrimaryKey(Play record);

    Play getPlayByPlayId(String playId);
    String getSeatInfo(String playId);
}