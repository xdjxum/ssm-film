package com.xud.controller;

import com.xud.service.FilmService;
import com.xud.vo.Film;
import com.xud.vo.FilmDetailsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FilmController {
    @Autowired
    private FilmService filmService;
    //获取所有影片信息
    @RequestMapping("/select")
    public @ResponseBody ModelAndView selectFilmAll(String film_name){
        ModelAndView modelAndView=new ModelAndView();
        List<Film>voFilms =filmService.selectFilmAll(film_name);
        modelAndView.addObject("voFilms",voFilms);
        modelAndView.setViewName("main");
        return modelAndView;
    }
    //获取影片详细信息
    @RequestMapping("/filmDetails")
    public @ResponseBody ModelAndView filmDetails(String filmId){
        ModelAndView modelAndView=new ModelAndView();
        FilmDetailsVo filmDetails =filmService.filmDetails(filmId);
        modelAndView.addObject("filmDetails",filmDetails);
        modelAndView.setViewName("/filmDetails");
        return modelAndView;
    }//后台管理展示影片信息
    @RequestMapping("/backtageFilm")
    public ModelAndView backtageFilmAll(String film_name){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("films",filmService.backtageFilmAll(film_name));
        modelAndView.setViewName("backtageFilm");
        return modelAndView;
    }
}
