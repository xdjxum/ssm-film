package com.xud.dao;

import com.xud.domain.Cinema;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CinemaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Cinema record);

    Cinema selectByPrimaryKey(Long id);

    List<Cinema> selectAll();

    int updateByPrimaryKey(Cinema record);

    Cinema selectByCinemaId(String cinemaId);
}