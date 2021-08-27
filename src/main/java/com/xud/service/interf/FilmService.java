package com.xud.service.interf;

import com.xud.dao.FilmDao;
import com.xud.vo.Film;
import com.xud.vo.FilmDetailsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FilmService implements com.xud.service.FilmService {
    @Autowired
    private FilmDao filmDao;
//    查询所有影片
    @Override
    public List<Film> selectFilmAll() {
        List<com.xud.domain.Film> doFilms=filmDao.selectFilmAll();
        List<Film> voFilms=new ArrayList<>(doFilms.size());
        for (com.xud.domain.Film doFilm:doFilms){
            Film voFilm=new Film(doFilm.getFilm_id(),doFilm.getFilm_name(),doFilm.getImg_path());
            voFilms.add(voFilm);
        }
        return voFilms;
    }
    //查询影片详细信息
    @Override
    public FilmDetailsVo filmDetails(String filmId){
        com.xud.domain.Film doFilm =filmDao.getFilmByID(filmId);
        FilmDetailsVo filmDetailsVo=new FilmDetailsVo(doFilm.getFilm_id(),doFilm.getFilm_name(),doFilm.getImg_path(),doFilm.getDriector(),
                doFilm.getPlayer(),doFilm.getFilm_type(),doFilm.getCountry(),doFilm.getLength(),doFilm.getSynopsis(),doFilm.getPlay_time());
        return filmDetailsVo;
    }
}
