package com.xud.controller;

import com.xud.service.PlayService;
import com.xud.vo.VoPlay;
import com.xud.vo.VoSert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PlayController {
    @Autowired
    private PlayService playService;
    @RequestMapping("/playAll")
    public @ResponseBody ModelAndView selectPlayAll(String filmId){
        List<VoPlay> plays=playService.selectPlayAll(filmId);
        ModelAndView modelAndView=new ModelAndView();
        System.out.println(plays);
        modelAndView.addObject("plays",plays);
        modelAndView.setViewName("play");
        return modelAndView;
    }
    @RequestMapping("/seatController")
    public @ResponseBody ModelAndView displaySeats(String playId){
        ModelAndView modelAndView=new ModelAndView();
        VoSert voSert =playService.displaySeats(playId);
        modelAndView.addObject("voSert",voSert);
        modelAndView.setViewName("seat");
        return modelAndView;
    }
    @RequestMapping("/selectSeat")
    public @ResponseBody String selectSeat(String playId){
        return playService.selectSeat(playId);
    }
}
