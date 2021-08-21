package com.xud.dao;

import com.xud.domain.Film;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmDao {
    //查询所有的影片信息
    @Select("select id,film_id,film_name,img_path from film")
    public List<Film> selectFilmAll();
    @Select("select * from film where film_id=#{filmId}")
    public Film getFilmByID(String filmId);
}
