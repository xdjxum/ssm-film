package com.xud.util;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public class Sql {
    public String getFilmByFilmNam(@Param("film_name")String film_name){
        String sql="select *from film ";
        if (film_name!=null&&!"".equals(film_name)){
            sql=sql+"where film_name=#{film_name}";
        }return sql;
    }
}
