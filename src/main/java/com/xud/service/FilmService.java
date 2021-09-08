package com.xud.service;

import com.xud.vo.Film;
import com.xud.vo.FilmDetailsVo;
import org.springframework.stereotype.Service;

import java.util.List;
public interface FilmService {
   public List<Film> selectFilmAll();//获取所有影片
   public List<Film> selectFilmAll(String film_name);//获取搜索影片
   public FilmDetailsVo filmDetails(String filmId);
   public List<com.xud.domain.Film> backtageFilmAll();
   public List<com.xud.domain.Film> backtageFilmAll(String film_name);
}
