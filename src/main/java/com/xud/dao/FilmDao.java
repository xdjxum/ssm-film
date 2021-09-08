package com.xud.dao;

import com.xud.domain.Film;
import com.xud.util.Sql;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmDao {
    //查询所有的影片信息
    @SelectProvider(type = Sql.class,method = "getFilmByFilmNam")
    public List<Film> selectFilmAll(@Param("film_name") String film_name);
    @Select("select * from film where film_id=#{filmId}")
    public Film getFilmByID(String filmId);
}
