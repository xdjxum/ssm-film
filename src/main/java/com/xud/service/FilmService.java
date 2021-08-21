package com.xud.service;

import com.xud.vo.Film;
import com.xud.vo.FilmDetailsVo;
import org.springframework.stereotype.Service;

import java.util.List;
public interface FilmService {
   public List<Film> selectFilmAll();
   public FilmDetailsVo filmDetails(String filmId);
}
