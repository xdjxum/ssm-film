package com.xud.controller;

import com.xud.domain.Forder;
import com.xud.service.ForderService;
import com.xud.service.PlayService;
import com.xud.util.Util;
import com.xud.vo.VoForder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;

@Controller
public class ForderController {
    @Autowired
    private ForderService forderService;
    @Autowired
    private PlayService playService;
    @RequestMapping("/insertForder")
    public @ResponseBody ModelAndView insertForder(String seat, BigDecimal price, String playId){
        VoForder voForder =forderService.insertForder(seat,price,playId);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("voForder",voForder);
        modelAndView.setViewName("forder");
        return modelAndView;
    }
}
